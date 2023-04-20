// function solution(d, budget) {
//     var answer = 0;
//     d.sort((a,b) => a-b);
//     // 투 포인터 : p q
//     let p = 0;
//     let q = 1;
//     let sum = d[0];
//     while(p <= q){
//         if(sum > budget){
//            sum -= d[p];
//            p--;
//         }else if(sum < budget){
//             q++;
//             sum += d[q];    
//         }
//         console.log("p" + p)
//         answer++;    
//     }
//     return answer;
// }

function solution(d, budget) {
    let result = 0
    let i = 0;
    d.sort((a,b) => a-b);

    while(result<=budget) {
        result += d[i];
        i++;
    }

    return i-1;
}