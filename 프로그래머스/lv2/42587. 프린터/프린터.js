function solution(priorities, location){
    let answer = 0;
    let first = null;
    // location 문서가 출력될 때 까지 반복
    while(true){
        // 배열의 첫 요소 dequeue
        first = priorities.shift();
        // 나머지 인쇄 대기 목록에서 first(현재 문서보다 우선순위가 높은) 문서 존재한다면 first를 가장 맨 마지막에 push
        if( first < Math.max(...priorities)) {
            priorities.push(first)
            if(location === 0) location = priorities.length-1;
            else location--;        
        // 현재 문서가 우선순위가 가장 높다면
        } else {
            answer++;
            if (location === 0) break;
            else location--;
        }
        
    }// while 종료
    return answer;
}




// function solution(priorities, location) {
//     let isfound = false;
//     let count = 0;
//     // 원하는 문서 출력이 안되었다면 반복
//     while(isfound !== true){
//         let ispushed= false
//         // 맨 앞 확인
//         let front = priorities.shift();
//          location--;
//          console.log(location)
//         // 대기 문서 중 우선 순위 검색해서 우선 순위 높은 문서가 있다면
//         priorities.forEach((doc) => {
//             if(front < doc) {
//                 priorities.push(front);
//                 ispushed = true;
//                 if(location === 0) location = priorities.length -1
//                 // break
//                 return false;
//             }
//         })
//         // 우선 순위 높은 문서가 없고 해당 front 가 가장 높은 우선순위라면
//         if(ispushed === false){
//         // 만약 현재 문서가 우선 순위기 가장 높은 거면 출력
//           count++;
//          // 원하는 문서인지 확인
//          if(0 === location) isfound = true;     
//         }  
//     }            
//     return count;
// }