function solution(n, lost, reserve) {
    
    const students = new Array(n).fill(1);
    
    reserve.map(it => {
        students[it-1]++;
    })
    
    lost.map(it => {
        students[it-1]--;
    })
    
    for(let j = 0; j < n; j++){
        if(students[j] === 2) {
            if(students[j-1] === 0) {
                students[j]--;
                students[j-1]++;
            }else if(students[j+1] === 0){
                students[j]--;
                students[j+1]++;
            }
        }
    }
    return students.filter(it => it >= 1).length;
}

// answer = []
//     for(let i = 0; i < n; i++){
//         answer.push(1);
//     }