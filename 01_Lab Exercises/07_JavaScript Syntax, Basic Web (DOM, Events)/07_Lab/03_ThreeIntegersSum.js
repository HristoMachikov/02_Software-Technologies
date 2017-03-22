function solve(args) {

    let numbers = args[0].split(' ').map(Number);

    console.log(
        check(numbers[0], numbers[1], numbers[2]) ||
        check(numbers[1], numbers[2], numbers[0]) ||
        check(numbers[2], numbers[0], numbers[1]) ||
            'No'
    );

    function check(firstNum, secondNum, sum) {
        if (firstNum + secondNum != sum){
            return false;
        }
        if (firstNum > secondNum){
            [firstNum, secondNum] = [secondNum, firstNum];
        }

        return `${firstNum} + ${secondNum} = ${sum}`;

    };
};

solve(['10 15 5']);