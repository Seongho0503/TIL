function solution(participant, completion) {
  // 두 배열을 문자열 정렬을 통해 다른 요소가 등장하면 종료시킨다
  // 문자열 배열 방법을 익혀두자
  participant.sort((a,b) => a > b ? 1 : -1);
  completion.sort((a,b) => a > b ? 1 : -1);
  console.log(participant) // [ 'eden', 'kiki', 'leo' ]
  console.log(completion) // [ 'eden', 'kiki' ]
  
  for(let i = 0; i < participant.length; i++){
     if(participant[i] !== completion[i]){
         return participant[i]
     }   
  }
}    
//     // 동명이인 처리 => 해쉬맵
//     const set = new Set(participant);
//     //console.log(filtered) // Set(3) { 'leo', 'kiki', 'eden' } 객체
//     let uniqueArr = [...set] // 	[ 'leo', 'kiki', 'eden' ] 객체를 배열로 변환 
//     //console.log(uniqueArr)
//     // uniqueArr은 let으로 선언해야함 밑에서 filter 때문에
// completion.map((it) => {        
//     uniqueArr = uniqueArr.filter(el => el !== it )
//     //console.log(participant)
//     })
//     return uniqueArr[0];
// }     
        
        // splice 사용 불가 (= 특정 요소 삭제 불가)
        // for(const person of completion) {
        //     if(it === person) {
        //         completion
        //     }
        // // }
        //  for(let i = 0; i < completion.length; i++){
        //      // 해당 선수
        //      if(it === completion[i]) {
        //         completion.splice(i,1);
        //          console.log(completion)
        //          break;
        //      }
        //  }
   //x })
