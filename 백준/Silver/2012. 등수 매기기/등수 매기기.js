const input = require("fs").readFileSync("/dev/stdin").toString().split('\n');

let count = input[0];
let numbers = [];

for (let i = 1; i < input.length; i++) {
  if (input[i] !== '') {
    numbers.push(input[i].split(' '));
  }
}

// 코드

numbers.sort((a, b) => a - b);
let answer = 0;
let grade = 1;
for (let i = 0; i < numbers.length; i++){
    answer += Math.abs(numbers[i] - grade);
    grade++;
}

console.log(answer);