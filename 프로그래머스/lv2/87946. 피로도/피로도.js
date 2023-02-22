function solution(k, dungeons) {
    let visited = []; 
    // hp = 현재 피로도 
    const travel = (hp, count) => {
     for(let i=0; i < dungeons.length; i++){
    // i번째 던전 방문 && 현재 피로도와 던전 진입 피로도 확인
        if(!visited[i] && dungeons[i][0] <= hp){
            visited[i] = true;
            cur_hp = hp - dungeons[i][1];
            travel(cur_hp, count+1);
            visited[i] = false;
        }    
     } //for문 종료
        answer = Math.max(answer, count);
    } // travel 종료
  
    let answer = -1;
    // dfs 
    travel(k, 0);
    return answer;
}