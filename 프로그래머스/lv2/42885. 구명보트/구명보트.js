
// function solution(people, limit) {
//     people.sort((a,b) => a-b);
//     let onboard = []; 
//     let sum = 0;
//     let count = 1;
//     for(let i = people.length; i > 0; i--){
//         if(sum + people[i] <= limit){
//             onboard.push(people[i]);
//             sum += people[i];   
//         }else {
//             onboard = []
//             count++;
//             onboard.push(people[i]);
//             sum = people[i];       
//         }
        
//     }
    
//     return count;
// }


function solution(people, limit){
	var answer = 0
    // 내림 차순 정렬
    people.sort((a,b) => b-a)
    let str = 0
    let end = people.length-1
    
    while(str < end){
    	var sum = people[str] + people[end]
        if(sum > limit){
        	str++
        } else {
        	str++
            end--
        }
        answer++
    }
    if(str === end) answer++
    return answer
}