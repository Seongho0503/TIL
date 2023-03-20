function solution(n, lost, reserve) {
    answer = []
    for(let i = 0; i < n; i++){
        answer.push(1);
    }
    
    reserve.map(it => {
        answer[it-1]++;
    })
    
    lost.map(it => {
        answer[it-1]--;
    })
    
    for(let j = 0; j < n; j++){
        if(answer[j] === 2) {
            if(answer[j-1] === 0) {
                answer[j]--;
                answer[j-1]++;
            }else if(answer[j+1] === 0){
                answer[j]--;
                answer[j+1]++;
            }
        }
    }
    return answer.filter(it => it >= 1).length;
}