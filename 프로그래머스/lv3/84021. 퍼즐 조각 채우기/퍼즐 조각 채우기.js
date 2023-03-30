function solution(game_board, table) {
    let count = 0;
    const dxy = [[1,0], [-1,0], [0,1], [0,-1]];
    const visited = table
    
    function dfs(y, x){
        for(let i = 0; i < 4; i++){
            let nx = y + dxy[i][0];
            let ny = x + dxy[i][1];
            
            if(nx < 0 || ny < 0 || nx >= table[0].length || ny >= table.length) continue;
            if(visited[ny][nx]) continue;
            
        }
    }
        
    for(let i = 0; i < table.length ; i++){
        for(let j = 0; j < table[0].length; j++){
            if(!table[i][j]){
                count++;
                dfs(i,j)
            }           
        }
    }
    
    return count;
}