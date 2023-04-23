function solution(N, road, K) {
    let arr = Array(N+1).fill(Infinity);
    let adj = Array.from(Array(N+1), () => Array());

    for(let [a, b, c] of road) {
        adj[a].push({ to: b, time: c });
        adj[b].push({ to: a, time: c });
    }
    
    let check = [{ to: 1, time: 0 }];
    arr[1] = 0;
    
    while(check.length) {
        let { to, time } = check.pop();
        
        adj[to].forEach(next => {
            // next.to: 이동할 마을 / to: 현재 마을 / next.time: 이동할 마을까지 걸리는 시간
            if(arr[next.to] > arr[to] + next.time) { 
                arr[next.to] = arr[to] + next.time;
                check.push(next);
            }
        });
    }
    
    return arr.filter((time) => time <= K).length;
}