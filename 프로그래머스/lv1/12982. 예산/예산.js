
// function solution(d, budget) {
//     let result = 0
//     let i = 0;
//     // 오름차순 정렬 : 작은 예산 부터 시작하면 최대 부서에게 지급 가능
//     d.sort((a,b) => a-b);

//     while(result <= budget) { // 이전 값 기준
//         result += d[i];
//         i++;
//     }

//     return i-1;
// }



function solution(d, budget) {

    // 오름차순 정렬 : 작은 예산 부터 시작하면 최대 부서에게 지급 가능
    d.sort((a,b) => a-b);
    let num = 0;
    let sum = 0;
    
    for(let i = 0; i <d.length; i++){
        if(sum + d[i] <= budget){ // 현재 값까지 포함
            sum += d[i];
            num++;
        }else{
            break
        }
    }
    return num;
}