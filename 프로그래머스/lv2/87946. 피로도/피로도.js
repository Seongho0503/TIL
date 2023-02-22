function solution(k, dungeons) {
    var visited = [];
    const travel = (hp, count) => {
          for(var i=0; i<dungeons.length; i++){
        if(!visited[i] && dungeons[i][0] <= hp){
            visited[i] = true;
            cur_hp = hp - dungeons[i][1];
            travel(cur_hp, count+1);
            visited[i] = false;
        }    
     }
        answer = Math.max(answer, count);
    } // travel 종료
  
    var answer = -1;
    travel(k, 0);
    return answer;
}