function solve(args) {
    let number = Number(args[0]);

    let result = "";

    for (let i = 1; i <= number; i++) {
        if (isSymmetric(i)) {
            result += i + " ";
        };
    };

    console.log(result);

    function isSymmetric(numb) {
        numb = numb.toString();

        let check = true;
        for (let j = 0; j < numb.length / 2; j++) {
            if (numb[j] != numb[numb.length - j - 1]) {
                check = false;
                break;
            };
        };
        return check;
    };
};

solve(['750']);