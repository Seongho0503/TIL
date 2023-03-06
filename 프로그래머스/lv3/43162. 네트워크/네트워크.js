// 네트워크 개수 (그래프) : 한번 방문한 곳은 다시방문하지 않는다
function solution(n, computers) {
    const visited = [false]

    function dfs(i) {
        // 방문 체크
       visited[i] = true;
       
        for(let j=0; j<computers.length; j++){
         // 두 노드가 연결되어있고 아직 방문을 안 했으면 방문
          if(computers[i][j]===1 && !visited[j] )  {
              dfs(j);
          }
        }
    }
    
    var count = 0;
    // 방문 체크
        
    for(let i = 0; i<computers.length; i++){
        if(!visited[i]){
            dfs(i)
            count++
        }
    }
    
    return count;
}