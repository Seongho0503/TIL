function solution(array, commands) {
    var answer = [];
    
    for(let i = 0; i < commands.length; i++){
        let start = commands[i][0];
        let end = commands[i][1];
        let k = commands[i][2];
        const cutarr = array.slice(start-1, end)
        console.log(cutarr)
        // 오름차순 정렬
        cutarr.sort((a,b) => a-b);
        answer.push(cutarr[k-1])
    }
    
    return answer;
}

// [ 5, 2, 6, 3 ]
// [ 6 ]
// [1, 5, 2, 6, 3, 7, 4]