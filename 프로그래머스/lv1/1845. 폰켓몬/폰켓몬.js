function solution(nums) {
    // 뽑을 수 있는 포켓몬 : 길이/2
    let max = nums.length/2;
    // 폰켓몬 종류 : 중복 숫자 제외
    const hash = new Set(nums) // 배열을 set 변환
    //console.log(hash) 〉	Set(3) { 3, 1, 2 }
    //console.log(hash.size) // hash.size : 3   
    
    let answer = max > hash.size ? hash.size : max
    
    return answer;
}