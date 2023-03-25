// 최단거리 bfs
// visited 방문 배열 (한 번 방문 한 곳 다시 방문 X) 
function solution(maps) {
    let count = 0;
    const visited = Array(maps.length).fill(0).map(()=> Array(maps[0].length).fill(0))
    // 오, 왼, 위, 아래 
    dx = [1,-1,0,0]
    dy = [0,0,1,-1]
    // 가로 , 세로
    let n = maps[0].length;
    let m = maps.length;
    let queue = [];
    queue.push([0,0]);
    visited[0][0] = 1;
    while(queue.length > 0){
        let [x, y] = queue.shift();
        for(let i = 0; i < dx.length; i++){
          let nx = x + dx[i];
          let ny = y + dy[i];
            // (등호주의) 등호를 안 붙여서 방향 이동이 안 되었다.
            if(nx < 0 || ny < 0 || nx >= n || ny >= m || maps[ny][nx] === 0) continue;
            // if(visited[ny][nx] !== 0) 와 if(visited[ny][nx]) 동일
            if(visited[ny][nx]) continue;
                queue.push([nx, ny]);
                visited[ny][nx] = visited[y][x] + 1;
        }
    }
    count = visited[maps.length - 1][maps[0].length - 1];
    // count=0 할당 후 !count 와 count === 0 동일
    if(!count) return -1;
    return count;
}