function solution(numbers) {
    var answer = 0;
    numbers.map((num) => {
        answer += num;
    })
    return answer/numbers.length;
}