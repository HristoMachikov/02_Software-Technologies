function solve(args) {

    let arr = [];

    for (let i = 0; i < args.length; i++) {
        let action = args[i].split(' ');
        let command = action[0];
        let number = action[1];

        switch (command){
            case 'add':
                arr.push(number);
                break;
            case 'remove':
                if (number <= arr.length - 1 && number >= 0){
                    arr.splice(number, 1);
                }
                break;
        }
    }

    for (let elem of arr) {
        console.log(elem)
    }
}

solve([
    'add 3',
    'add 5',
    'remove 2',
    'remove 0',
    'add 7'
]);