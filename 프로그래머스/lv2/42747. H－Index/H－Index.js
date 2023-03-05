function solution(citations) {
    citations.sort((a, b) => b - a);

    let answers = 0;
    for (let i = 0; i < citations.length; i++) {
        if (i < citations[i]) {
            answers++;
        }
    }

    return answers;
}


// function solution(citations) {
//     let answer = 0;
//     let len = citations.length
//     // 오름차순 정렬
//     citations.sort((a,b) => a-b);
//     // mid값(index) 찾기
//     let mid = Math.floor(len/2);
//     //k의 개수가 i개 이상 && 전체-k 가 i 이하
//     while(answer === 0){
//         // 해당 값
//         let cur = citations[mid]
//         // h편 이상 개수 : len-mid
//         // 나머지 h번 이하 개수 : mid
//         if(len-mid >= cur && mid <= cur) answer = cur;
//         else mid--;    
//    }
//     return answer;
// }