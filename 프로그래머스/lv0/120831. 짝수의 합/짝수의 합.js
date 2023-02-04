function solution(n) {
    var answer = 0;
    var count = parseInt(n/2);
    for(let i =1 ; i<=count ; i++){
        answer+= 2*i;
    }
    return answer;
}