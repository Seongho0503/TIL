function solution(numbers) {
    const sums = [];
    const answer = [];
    for(let i = 0; i < numbers.length; i++){
        for(let j = 0; j < numbers.length; j++){
           if(i !== j){
            sums.push(numbers[i] + numbers[j]); 
           }
        }
    }
    
    sums.forEach((e) => {
        if(!answer.includes(e)){
            answer.push(e);
        }
    })
    
    answer.sort((a,b) => a-b);
    return answer;
}