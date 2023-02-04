function solution(n) {
    var answer = [];
    count = Math.round(n/2);
    for(let i =1 ; i<=count; i++){
        answer.push(2*i -1);
    }
    return answer;
}