function solve(args) {

    let arr = [];
    let check = args[args.length - 1];

    for (var i = 0; i < args.length - 1; i++) {
        let innerArr = args[i].split(' ');
        let key = innerArr[0];
        let value = innerArr[1];

        if (!arr[key]){
            arr[key]=[];
        }
        arr[key].push(value);
    }

    if (arr[check]){
        for (let value of arr[check]) {
            console.log(value)
        }
    } else {
        console.log('None')
    }
}

solve([
    '3 test',
    '3 test1',
    '4 test2',
    '4 test3',
    '4 test5',
    '4'
]);