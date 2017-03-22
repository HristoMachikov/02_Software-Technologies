function solve(args) {

    let arr = [];
    for (let elem of args) {
        let innerArr = elem.split('->').map(x => x.trim());
        var obj = {
            Name: innerArr[0],
            Age: innerArr[1],
            Grade: innerArr[2]
        };
        arr.push(obj)
    }

    for (let obj of arr) {
        for (let key in obj) {
            console.log(`${key}: ${obj[key]}`)
        }
    }
}

solve([
    'Pesho -> 13 -> 6.00',
    'Ivan -> 12 -> 5.57',
    'Toni -> 13 -> 4.90'
]);