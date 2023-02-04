function solution(money) {
    var answer = [];
    cups = parseInt(money / 5500);
    coin = parseInt(money % 5500);
    answer.push(cups, coin);
    return answer;
}