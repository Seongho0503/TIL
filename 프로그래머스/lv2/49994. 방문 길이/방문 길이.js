function solution(dirs) {
    var answer = 0;
    let move = {L: [-1,0], R:[1,0], D:[0,-1], U:[0,1]}
    let now = [0,0];
    let route = new Set();
    
    for(let dir of dirs){
        let nowX = now[0] + move[dir][0];
        let nowY = now[1] + move[dir][1];
        
        if(nowX > 5 || nowY > 5 || nowX < -5|| nowY < -5) continue;
        route.add("" + now[0] + now[1] + nowX + nowY);
        route.add("" + nowX + nowY + now[0] + now[1]);
        
        now = [nowX, nowY]
        //console.log(route);
        
    }
    return route.size/2;
}