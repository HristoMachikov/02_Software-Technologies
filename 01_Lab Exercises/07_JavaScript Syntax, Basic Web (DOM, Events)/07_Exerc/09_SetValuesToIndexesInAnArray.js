function solve(args) {
    let length = Number(args[0]);

    let arr = [];
    for ( let i = 0; i < length; i++){
        arr.push(0);
    };
    for ( let i = 1; i < args.length; i++){
        let currentArr = args[i].split(" - ");
        let index = Number(currentArr[0]);
        let value = Number(currentArr [1]);
        arr.splice(index, 1, value);
    };

    for ( let i = 0; i < arr.length; i++){
        console.log(arr[i]);
    };
};

solve(['5', '0 - 3', '3 - -1', '4 - 2']);