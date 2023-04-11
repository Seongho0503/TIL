function solution(weights) {
  let answer = 0;
  const map = new Map();
  const ratio = [1, 3 / 2, 2, 4 / 3];

  weights.sort((a, b) => b - a);

  for (const w of weights) {
    for (const r of ratio) {
      if (map.has(w * r)) answer += map.get(w * r);
    }
    map.set(w, (map.get(w) || 0) + 1);
  }
  return answer;
}

// function solution(weights) {
//     var count = 0;
//     for(let i = 0; i < weights.length-1; i++){
//         const arr = makearr(weights[i]);
//         for(let j = 0; j < weights.length; j++){
//         if(i === j) break;
//             for(let k = 0; k < 3 ; k++){
//                 let num = arr[k] / weights[j];
//                  if( num === 1 || num === 2 || num === 3 || num === 4 ){
//                     count++;
//                     break;
//                  }      
//             }
//         }
//     }

//     function makearr(num2){
//         return [num2, num2 * 2, num2 * 3, num2 * 4]
//     }    
//     return count;
// }