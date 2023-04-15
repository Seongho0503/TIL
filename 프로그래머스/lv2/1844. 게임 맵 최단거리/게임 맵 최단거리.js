function solution (maps) {
    let count = 0;
     const visited = Array(maps.length).fill().map(()=> Array(maps[0].length).fill(0))

    let dx = [1,-1,0,0]
    let dy = [0,0,1,-1]
    let que = []
    que.push([0,0]);
    visited[0][0] = 1;
    
    while(que.length > 0){
        let [x,y] = que.shift();
        for(let i =0; i < 4; i++){
            let nx = x + dx[i];
            let ny = y + dy[i];
    // visited[ny][nx] === 0 실수로 maps[ny][nx] === 0 이라 써서 오류 생겼음.
    if(nx < 0 || ny < 0 || nx >= maps[0].length || ny >= maps.length || maps[ny][nx] === 0) continue
    if(visited[ny][nx]) continue;       
        que.push([nx,ny])
        visited[ny][nx] = visited[y][x] + 1;
        }
    }
    
    count = visited[maps.length-1][maps[0].length-1];
    if(!count) return -1;

    return count
}