function solution(numbers) {
    var answer = [];
   numbers.map((key) => {
        answer.push(key*2);
    })
    return answer;
}