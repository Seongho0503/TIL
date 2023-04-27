function solution(n, stations, w) {
    var answer = 0;
    let range = (w * 2) + 1; 
    
    // 왼쪽 사이드 : 시작 기지국 - 범위(반) - 시작점
    let left = (stations[0] - w) - 1;
    answer +=  Math.ceil(left / range)
    
    
    // 오른쪽 사이드 : 마지막 기지국 + 범위(반)
    let right = n - (stations[stations.length-1] + w )
    answer +=  Math.ceil(right / range)
    
    // 기지국 사이 : 투 포인터로 앞 뒤의 두 기지국만 비교한다
    for(let i = 0; i < stations.length -1; i++){
       //for(let j = i+1; j < i+2; j++){
           // 앞 기지국 - 뒤 기지국 -1 - 전파 범위(양방향)
            let len = stations[i+1] - stations[i] -1 -2*w;
            answer += Math.ceil(len / range);
       //}
    }
    
    return answer;
}