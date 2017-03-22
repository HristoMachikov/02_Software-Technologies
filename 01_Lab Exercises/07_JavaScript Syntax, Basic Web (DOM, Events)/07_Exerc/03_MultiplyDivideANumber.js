function solve(args) {
    let firstNumb = Number(args[0]);
    let secondNumb = Number(args[1]);
    if (firstNumb<=secondNumb){
        console.log(firstNumb*secondNumb);
    } else {
        console.log(firstNumb/secondNumb);
    }
}
solve(['100', '50'])