function solution(my_string, n) {
    var answer = '';
    const str = my_string.split("");
    str.map((key)=> {
        for(let i = 0; i<n ; i++) answer+= key    
    });
    return answer;
}