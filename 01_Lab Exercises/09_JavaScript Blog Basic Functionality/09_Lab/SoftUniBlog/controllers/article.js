const Article = require('mongoose').model('Article');

function checkError(req,articleProp) {

    let errorMsg = '';

    if(!req.isAuthenticated()){
        errorMsg = 'You should be logged in to operate articles!'
    } else if (!articleProp.title) {
        errorMsg = 'Article title cannot be empty!';
    } else if (!articleProp.content) {
        errorMsg = 'Article content cannot be empty!';
    }

    return errorMsg;
}

module.exports = {
    createGet: (req, res) => {
        res.render('article/create')
    },
    createPost: (req, res) => {
        let articleProp = req.body;

        let errorMsg = checkError(req,articleProp);

        if (errorMsg) {
            res.render ('article/create', {error: errorMsg});
            return;
        }

        // Insert, save in base and set multiply image files
        let images = req.files.images;

        if (images) {
            for (let image of images) {
                let filename = image.name;
                image.mv(`./public/images/${filename}`, err => {
                    if (err) {
                        console.log(err.message);
                    }
                });
            }

            let imageArray = [];
            for (let image of images) {
                imageArray.push(`/images/${image.name}`);
            }

            articleProp.pathImage = imageArray;
        }

        // Insert, save in base and set pdf file
        let pdf = req.files.pdf;

        if (pdf) {
            let pdfname = pdf.name;
            pdf.mv(`./public/pdf/${pdfname}`, err => {
                if (err) {
                    console.log(err);
                }
            });

            articleProp.pathPdf = `/pdf/${pdfname}`;
        }

        articleProp.author = req.user.id;
        Article.create(articleProp).then(article => {
            req.user.articles.push(article.id);
            req.user.save(err => {
                if (err){
                    res.redirect('/', {error: err.message});
                } else {
                    res.redirect('/');
                }
            });
        })
    },
    details: (req, res) => {
        let id = req.params.id;

        Article.findById(id).populate('author').then(article => {
            if (!req.user){
                res.render('article/details', {article: article, isUserAuthorized: false});
                return;
            }

            req.user.isInRole('Admin').then(isAdmin => {
                let isUserAuthorized = isAdmin || req.user.isAuthor(article);

                res.render('article/details', {article: article, isUserAuthorized: isUserAuthorized});
            });
        });
    },
    editGet: (req,res) => {
            let id = req.params.id;

            if (!req.isAuthenticated()) {
                let returnUrl = `/article/edit/${id}`;
                req.session.returnUrl = returnUrl;

                res.redirect('/user/login');
                return;
            }

            Article.findById(id).then(article => {
                req.user.isInRole('Admin').then(isAdmin => {
                    if (!isAdmin && !req.user.isAuthor(article)) {
                        res.redirect('/');
                        return;
                    }

                    res.render('article/edit', article)
                });
            });
    },
    editPost: (req, res) => {
        let id = req.params.id;
        let articleProp = req.body;

        let errorMsg = checkError(req,articleProp);

        if (errorMsg) {
            res.render ('article/edit', {error: errorMsg});
            return;
        }

        Article.update({_id: id}, {$set: {title: articleProp.title, content: articleProp.content}})
            .then(updateStatus => {
                res.redirect(`/article/details/${id}`);
            })
    },
    deleteGet: (req, res) => {
        let id = req.params.id;

        if (!req.isAuthenticated()) {
            let returnUrl = `/article/delete/${id}`;
            req.session.returnUrl = returnUrl;

            res.redirect('/user/login');
            return;
        }

        Article.findById(id).then(article => {
            req.user.isInRole('Admin').then(isAdmin => {
                if (!isAdmin && !req.user.isAuthor(article)) {
                    res.redirect('/');
                    return;
                }

                res.render('article/delete', article)
            });
        });
    },
    deletePost: (req,res) => {
        let id = req.params.id;
        Article.findOneAndRemove({_id: id}).populate('author').then(currentArticle => {
            let author = currentArticle.author;

            let index = author.articles.indexOf(currentArticle.id);

            if (index >= 0){
                author.articles.splice(index, 1);
                author.save().then((user) => {
                    res.redirect('/')
                });
            } else {
                let errorMsg = 'Article was not found for that author!';
                res.render('article/delete', {error: errorMsg})
            }
        })
    }
};