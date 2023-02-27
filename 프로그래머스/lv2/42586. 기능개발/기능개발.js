function solution(progresses, speeds) {
    let answer = [];
    progresses.map((num, idx) => {
        //num + idx * k >= 100 
        k = Math.ceil((100-num) / (speeds[idx]))  // 소수점 올림 처리 필수 (js)
        answer.push(k); // 걸리는 시간 
    })
    let stack = []; // 스택용
    let idx  = 0;  // 인덱스
    let count = []; // 최종 배포 count 
    // stack
    console.log(answer)
    while(answer.length !== 0){ // 위에서 구한 배열이 비어있지 않으면
        //let cur = answer[idx]; 
        let cur = answer.shift(); // peak 꼭대기 값 확인 및 제거가 필수!
        console.log(cur)
        console.log("이전값", stack[stack.length-1])
        //if(stack.length === 0 || stack[stack.length-1] >= cur){ // 스택이 비어있거나 지금의 값이 이전 값보다 작으면 스택 push
        if(stack.length === 0 || stack[0] >= cur){   
         stack.push(cur) // 현재 값 스택에 넣기
            console.log("넣기")
            //console.log(cur)
            //console.log (stack)
        }else { // 현재 값이 이전 값보다 크다면
            count.push(stack.length); // 기존의 스택의 길이만큼 최종 배포 개수 배열에 push  
            stack = []; // 기존 값 전부 출력(초기화)
            stack.push(cur); // 현재 값은 스택에 넣기
        }    
    }
    count.push(stack.length); // 마지막 스택의 길이는 최종 배포 개수 배열에 push
    return count;
}


