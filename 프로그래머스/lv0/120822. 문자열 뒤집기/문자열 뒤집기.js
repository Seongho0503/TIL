function solution(my_string) {
    var answer = '';
    var count = my_string.length;
    var arr = my_string.split("");
    for(let i =count-1; i >= 0; i--)
            answer += arr[i];
    return answer;
}