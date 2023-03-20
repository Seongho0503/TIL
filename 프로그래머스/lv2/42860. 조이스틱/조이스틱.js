function solution(name) {
  let answer = 0;
  let min_move = name.length - 1;
   // console.log([...name]); 	[ 'J', 'E', 'R', 'O', 'E', 'N' ]
    // 1. 상, 하 움직임
    // A와 Z 시작점 중에서 최소 거리 찾기
  [...name].map((n, i) => {
  answer += Math.min(n.charCodeAt() - 'A'.charCodeAt(0), 'Z'.charCodeAt(0) - n.charCodeAt()+1);
    let idx = i + 1;

    // 연속되는 A의 개수 count
    while (idx < name.length && name[idx] === 'A') {
      idx++;
    }

  // 2. 최소 이동 거리
    min_move = Math.min(
      min_move,
      i * 2 + name.length - idx,
      i + 2 * (name.length - idx),
    );
  });

  return answer + min_move;
}

// function solution(name) {
//   var answer = 0;

//   // 문자 만들기
//   for(let i = 0; i < name.length; i++){    
 
//     let Acal = name.charCodeAt(i) - 'A'.charCodeAt(0);
//     let Zcal = 'Z'.charCodeAt(0) - name.charCodeAt(i) + 1;
//     answer += Math.min(Acal, Zcal);
  
    
//   }
//     let aindex = name.indexOf('A');
//     let lastidx = aindex;
//     if(aindex !== -1){
//         for(let i = aindex+1; i < name.length; i++){
//             if(name[i] !== 'A') break;
//             else lastidx++;
//         }
//     }
//     answer += Math.min(name.length - 1, name.length - (lastidx+1));
   

//   return answer;
// }