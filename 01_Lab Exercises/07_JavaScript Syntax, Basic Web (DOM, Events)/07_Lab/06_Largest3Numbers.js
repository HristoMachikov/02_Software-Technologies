function solve(args) {
    let result = args
        .sort((a, b) => b - a);

    let length = 3;
    if (result.length < length){
        length = result.length
    };

    for (var i = 0; i < length; i++) {
       console.log(result[i]);
    };
};

solve([10, 5, 20, 3, 30]);