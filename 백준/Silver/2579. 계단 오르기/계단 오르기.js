const input = require("fs").readFileSync("/dev/stdin").toString().split('\n');

let num = Number(input[0]); // 문자열을 숫자로 변환해야함 
let stairs = [];

for (let i = 1; i < input.length; i++) {
  if (input[i] !== '') {
    stairs.push(Number(input[i])); // 문자열을 숫자로 변환해야함
  }
}

const dp = new Array(num + 1).fill(0);
dp[0] = 0
dp[1] = stairs[0];
dp[2] = Math.max(dp[0] + stairs[1], dp[1] + stairs[1]);

for(let i = 3; i < num + 1; i++){
    // 현재 계단에서 가장 큰 값 갱신 (이전 계단 + 현재 계단 점수) vs 두 계단 아래 값
    dp[i] = Math.max(dp[i-3] + stairs[i - 1] + stairs[i-2], dp[i-2] + stairs[i-1]);
}

console.log(dp[num]);