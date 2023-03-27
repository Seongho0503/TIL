function solution(s) {
    let answer = false;
    const stack = [];
    let top = -1;

    if(s[0] === ")" || s[s.length-1] === "(" || s.length % 2 === 1) return answer;
    
    for(let i = 0; i < s.length; i++) {
        const cur = s[i];

        if(top === -1 || cur === "(") {
            stack[++top] = cur;
        } else {
            if(stack[top] === ")") break;
            top--;
        }

         if(top > s.length - i + 1) break;
    }

    if(top === -1) answer = true;

    return answer;
}