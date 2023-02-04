function solution(numbers) {
    var answer = 0;
    numbers.map((num1, idx1) => {
        numbers.map((num2, idx2)=>{
            if(idx1!=idx2)
            answer = Math.max(num1*num2, answer)
        })
    })
    return answer;
}