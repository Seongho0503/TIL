function solution(n, k) {
    var answer = 0;
    var bonus = parseInt(n/10);
    answer = n * 12000 + (k-bonus)*2000;
    return answer;
}