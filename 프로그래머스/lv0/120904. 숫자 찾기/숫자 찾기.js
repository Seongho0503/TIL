function solution(num, k) {
    let str = num + ""; // 숫자를 문자열로
    let answer = str.indexOf(k+""); // k 문자 있으면 맨 앞 인덱스 반환 (str index는 0부터 시작) // 처음에 "k" 써써 오류 
    return answer = answer >= 0 ? ++answer : answer ;
}