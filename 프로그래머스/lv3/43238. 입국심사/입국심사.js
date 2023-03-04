function solution(n, times) {
    var sum = 0;
    // 최솟값
    let left = 0;
    // 최대값 : 가장 오래 걸리는 상담원한테 사람들이 다 가는 경우 *time를 sort해서 찾아도 된다
    let right = n * Math.max(...times) ; 
    // = 꼭 들어가야 한다
    while(left<=right){
        // 소수점 버리기
        const mid = Math.floor((left+right)/2);
        let count = 0;
        // 해당 mid 시간동안 입국심사원이 심사가능한 최대 인원 수
        times.forEach((it) => {
            count += Math.floor(mid/it)
        })
        
        // 해당 인원수를 찾은 경우
        //if(count === n) return mid;
        
        // mid 값을 줄어야 할 때 => mid 왼쪽 이동
        if(count >= n){
            right = mid - 1
        // mid 값을 늘려야 할 때 => mid 오른쪽 이동
        }else {
            left = mid + 1
        }    
    }
    return left;
}


// function solution(n, times) {
//     let low = 1;
//     let high = Math.max(...times) * n;
//     while (low <= high) {
//         const mid = Math.floor((low + high) / 2);
//         const people = times.reduce((acc, time) => acc + Math.floor(mid / time), 0);
//         if (people < n) {
//             low = mid + 1;
//         } else {
//             high = mid - 1;
//         }
//     }
//     return low;
// }