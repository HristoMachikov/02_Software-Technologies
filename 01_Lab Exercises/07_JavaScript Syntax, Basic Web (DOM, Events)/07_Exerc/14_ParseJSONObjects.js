function solve(args) {

    let arr = [];
    for (let elem of args) {
        var obj = JSON.parse(elem);
        arr.push(obj)
    }

    for (let obj of arr) {
        for (let key in obj) {
            let objValue = obj[key];
            console.log(`${key.replace(/\b\w/, key[0].toUpperCase())}: ${objValue}`)
        }
    }
}

solve([
    '{"name":"Gosho","age":10,"date":"19/06/2005"}',
    '{"name":"Tosho","age":11,"date":"04/04/2005"}'
]);