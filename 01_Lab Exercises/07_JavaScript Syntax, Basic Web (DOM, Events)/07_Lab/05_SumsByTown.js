function solve(args) {
    let objs = {};
    for (let i = 0; i < args.length; i++) {
        let parsedObj = JSON.parse(args[i]);

        if (!objs[parsedObj.town]) {
            objs[parsedObj.town] = 0;
        };

        objs[parsedObj.town] += parsedObj.income;
    };

    let names = Object.keys(objs).sort();

    for (let name of names) {
        console.log(`${name} -> ${objs[name]}`);
    };
};


solve(['{"town":"Sofia","income":200}',
    '{"town":"Varna","income":120}',
    '{"town":"Pleven","income":60}',
    '{"town":"Varna","income":70}'
]);