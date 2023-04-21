const money = parseInt(require("fs").readFileSync("/dev/stdin").toString());

const coins = [1, 5, 10, 50, 100, 500];
let budget = 1000 - money;
coins.sort((a, b) => b - a);
let result = 0;


for (let i = 0; i < coins.length; i++){
    let coin_num = Math.floor(budget / coins[i]);
    if (coin_num * coins[i] <= budget) {
        budget -= (coin_num * coins[i]);       
        //console.log(coins[i] + " 일 떄 " + coin_num + " 코인 개수");
        result += coin_num;
    } else {
        break;
    }
}

console.log(result);

// 언제나 거슴름 돈 개수가 가장 적게 잔돈을 준다 = 그리디
// 돈 개수가 가장 적게 줄려면 큰 금액부터 줘야 된다. (내림차순 정렬)
// 380원 구매 => 620원 잔액 => 500 1개 , 100 1개, 10 2개 => 총 4개