function solution(n) {
    var answer = [];
    
    // 직각 삼각형 이차원 배열 만들기
    const arr = new Array(n).fill().map((_, idx) => new Array(idx+1));
    
    let x = -1;
    let y = 0;
    let count = 1;
    
    while(n > 0){
        for(let i = 0; i < n; i++) arr[++x][y] =  count++; 
        for(let j = 0; j < n-1; j++) arr[x][++y] = count++;
        for(let k = 0; k < n-2; k++) arr[--x][--y] = count++;
        
        n -= 3;
    }
    
    return arr.flatMap(e => e);
}