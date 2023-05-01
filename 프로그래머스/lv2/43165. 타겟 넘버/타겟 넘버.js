// +, - 선택 dfs
function solution(numbers, target) {
    // function 안에 선언하면 전역변수로 사용가능  
    let count = 0;
   
    function dfs(sum, index){
         // 피연산자를 다 사용했으면
        if(index === numbers.length ){
        // 총합이 targer 하고 같은지 확인
            if(sum === target){
                 count++;
            }
            return;   
        }
        let cur = numbers[index];
        
        dfs(sum + cur, index+1);
        dfs(sum - cur, index+1);     
    }
    dfs(0,0)
    return count;
}











// +, - 선택 dfs


// function solution(numbers, target) {
//    function dfs(count, sum) {
//       // 피연산자를 다 사용했으면
//      if(count === numbers.length){
//       // 총합이 targer 하고 같은지 확인
//        if(sum === target) answer++;
//         return;
//      }  
//        let num = numbers[count]
//        dfs(count+1,sum+num)
//        dfs(count+1,sum-num)
//    }
    
//     let answer = 0;  // function 안에 function 선언하면 전역변수로 사용가능  
//     dfs(0,0)

//     return answer;
    
// }