function solution(numbers) {
    const sums = [];
    // 두 요소의 합
    for(let i = 0; i < numbers.length; i++){
        for(let j = i+1; j < numbers.length; j++){
            sums.push(numbers[i] + numbers[j]); 
        }
    }
    // 중복 제거
    const answer = [...new Set(sums)];
     
    // 정렬
    answer.sort((a,b) => a-b);
    return answer;
}