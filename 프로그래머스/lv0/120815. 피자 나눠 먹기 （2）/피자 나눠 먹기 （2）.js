function solution(n) {
    var answer = Math.min(n, 6);
    while(true){
        if(answer%n===0 && answer%6===0) {
            break;
        }
        answer++;
    }
    return answer/6;
}