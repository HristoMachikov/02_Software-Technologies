function solve(args) {

    let objs = {};
    for (let obj of args) {
        let innerArr = obj.split('->').map(x => x.trim());
        let objKey = innerArr[0];
        let objValue = innerArr[1];

        if (Number(objValue)){
            objs[objKey] = Number(objValue)
        } else {
            objs[objKey] = objValue;
        }
    }

    let str = JSON.stringify(objs);
    console.log(str);
}

solve([
    'name -> Angel',
    'surname -> Georgiev',
    'age -> 20',
    'grade -> 6.00',
    'date -> 23/05/1995',
    'town -> Sofia'
]);