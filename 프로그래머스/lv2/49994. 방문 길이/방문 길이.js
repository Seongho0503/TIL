function solution(dirs) {
    let move = { L: [-1, 0], R: [1, 0], U: [0, 1], D: [0, -1] };
    let now = [0, 0];
    let route = new Set();
    
    for (let dir of dirs) {
        let nowX = now[0] + move[dir][0];
        let nowY = now[1] + move[dir][1];
        
        if (nowX > 5 || nowX < -5 || nowY > 5 || nowY < -5) continue;
        
        route.add("" + now[0] + now[1] + nowX + nowY);
        route.add("" + nowX + nowY + now[0] + now[1]);
        
        now = [nowX, nowY];
        //console.log(route);
    }
    
    return route.size / 2;
}


// function solution(dirs) {
//     const visited = Array(12).fill().map(() => Array(12).fill(false));
//     const newArr = dirs.split("");
//     const shift = [[0,1], [0,-1], [1,0], [-1,0]]
//     let cur = [5,5]
//     let count = 0;
    
//     for(let i = 0; i < newArr.length; i++){
//           console.log(cur)
//         switch(newArr[i]){
//             case "U":
//                 go(shift[0]);
//                 break;
//             case "D":
//                 go(shift[1]);
//                 break;
//             case "R":
//                 go(shift[2]);
//                 break;
//             case "L":
//                 go(shift[3]);
//                 break;
               
//         }
//     }
    
//     console.log(visited);
    
//     function go(dir){
//         let x = cur[0] + dir[0];
//         let y = cur[1] + dir[1];
//         if(x < 0 || y < 0 || x >= 10 || y>= 10) return;
//         if(visited[x][y] === false) {
//             visited[x][y] = true;
//             count++;
//         }
//         cur = [x,y];
//     }
    
//     console.log(cur)
//     return count;
// }

// 방문 배열 visited => 개수 체크