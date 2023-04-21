// 한 줄
const num = parseInt(require("fs").readFileSync("/dev/stdin").toString());

let count = 0;
let weight = num;
//console.log(num);

while (weight > 0) {
    if (weight % 5 === 0) {
        count += (weight / 5);
        weight = 0;
        break;
    } else {
        count++;
        weight -= 3;
    }
    // count++;
    // weight -= 3;
}

console.log(weight === 0 ? count : -1);