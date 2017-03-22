function solve(args) {
    let count = 0;
    for (let i = 0; i <args.length; i++ ){
        let currentNumb = Number(args[i]);
        if (currentNumb <= 0){
            count++;
            if (currentNumb ===0){
                count = 0;
                break;
            }
        }
    }
    if (count % 2 == 0){
        console.log('Positive');
    } else {
        console.log('Negative');
    }
}

solve(['-3', '-3', '-0'])