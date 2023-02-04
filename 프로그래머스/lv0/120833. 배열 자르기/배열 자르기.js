function solution(numbers, num1, num2) {
    var answer = [];
    numbers.map((key, idx) => {
        if(idx>= num1 && idx <= num2) answer.push(key);
    })
    return answer;
}