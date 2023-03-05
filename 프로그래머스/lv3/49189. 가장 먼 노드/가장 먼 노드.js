// 그래프 문제 (노드, 간선, 관계)
// 연결리스트 자료구조
// 최단 거리 => BFS
function solution(n, edge) {
    var answer = 0;
    
    // 연결리스트 구현 (1번 인덱스 부터 사용하기 위해 n+1)
    const graph = Array.from(Array(n+1), () => []);
    
    // 간선 연결 (양방향이라고 문제에 나와있음)
    for(const [a,b] of edge) {
        graph[a].push(b);
        graph[b].push(a);
    }
   // console.log(graph)
// [
//   [],
//   [ 3, 2 ],
//   [ 3, 1, 4, 5 ],
//   [ 6, 4, 2, 1 ],
//   [ 3, 2 ],
//   [ 2 ],
//   [ 3 ]
// ]
    
    // 노드 별 depth로 1번 노드에서 깊이 측정
    const depth = new Array(n+1).fill(0);
    depth[1] = 1;
    // 디버깅용 (공부용) BFS 방문 순서
    //const visited = [];
    // bfs(1) 하고 같은 의미 : 1번 노드 부터 bfs 탐색
    const queue = [1];
    // BFS : 너비 우선 탐색, 가까이 있는 노드 먼저 탐색
    while(queue.length > 0){
        // dequeue
        const start = queue.shift();
        // graph[start] start 노드에 연결된 노드 배열
        for(const dest of graph[start]){
            // 방문을 안한 노드면 방문
            if(depth[dest] === 0){
                // visited.push(dest);
                // enqueue
                queue.push(dest);
                // depth 증가
                depth[dest] = depth[start] +1;
            }
        }
    }
    //console.log(visited); // [ 3, 2, 6, 4, 5 ] 1번 노드는 시작노드 이기 때문에 안 들어갔음
   
    // 1번에서 깊이가 가장 깊은 것을 찾기 위해 내림차순 sort
    depth.sort((a,b) => b - a);
    // 첫번째 방법 : filtered.length
    //const filtered = depth.filter((it) => it === depth[0])
    // 두번째 방법 : return
    let count = 0;
    depth.forEach((it) => {
        if(it !== depth[0]) return
        else count++
    })
    return count;
}