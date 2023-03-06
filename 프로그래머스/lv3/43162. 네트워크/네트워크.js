// dfs : 선택이유
// 간선을 따라 이동하다가 이동하지 못한 경우 그래프가 나눠지기 때문에
// 네트워크 개수 = 그래프 개수
// [[1, 1, 0], [1, 1, 0], [0, 0, 1]] computers[i][j] 인접행렬
function solution(n, computers) {
 // 배열의 원소를 굳이 다 안채워도 된다. js 배열은 유동적
 let visited = [false]
 let count = 0;
    
   function dfs(i) {
       // 현재 노드 방문
       visited[i] = true
       for(let j = 0; j < computers[i].length; j++){
           if(computers[i][j]===1 && !visited[j]){
               dfs(j);
           }
       }
   } 
    
    // dfs가 끊기고 새로 시작된다는 것은 중간에 노드끼리 간선 연결이 안 되어 있고 끊어져 있는 상태라는 의미 
    for(let i = 0; i < computers.length; i++){
        if(!visited[i]){
            dfs(i)
            count++;
        }
    }
 
    return count;
}