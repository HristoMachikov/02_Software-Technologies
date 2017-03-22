function solve(args) {
    let arr = args
        .join(' ')
        .split(/\W+/)
        .filter(x => x.length >0)
        .filter(x => x === x.toUpperCase())
        .join(', ')
    console.log(arr);

};

solve(['We start by HTML, CSS, JavaScript, JSON and REST.',
    'Later we touch some PHP, MySQL and SQL.',
    'Later we play with C#, EF, SQL Server and ASP.NET MVC.',
    'Finally, we touch some Java, Hibernate and Spring.MVC.'
]);