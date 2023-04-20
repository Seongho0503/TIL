function solution(n, words) {
    var answer = [];
    // 첫 번째 단어의 마지막 알파벳 미리 넣기
    let char = words[0][words[0].length-1];
    for(let i = 0; i < words.length; i++){
        // 가장 먼저 탈락 하는 사람과 말 순서
        
         // 배열에서 해당 원소 개수 > 1 일 때 가장 먼저 중복되는 사람 체크
         if(words.indexOf(words[i]) !== i){
            answer.push(i%n+1, Math.floor(i/n) +1);
             break;
            //answer.push([i%n,i+1]);  [] 괄호 안 치고 ,(콤마) 쓰면 된다
         }

         // 첫 번째 사람은 안 들어감. 
      if(i > 0){ 
        if( words[i][0] === char){
            char = words[i][words[i].length-1];    
        }else{
             answer.push(i%n+1, Math.floor(i/n) +1);
             break;
        }
      }
           
    }
    
    return answer.length > 1 ? answer : [0,0];
}