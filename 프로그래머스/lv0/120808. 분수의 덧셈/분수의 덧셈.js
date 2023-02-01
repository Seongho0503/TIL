function solution(numer1, denom1, numer2, denom2) {
    var answer = [];
    var mom = denom1>denom2 ? denom2 : denom1; // 최소 공배수 시작 구간 
    var max = denom1 * denom2; // 최소 공배수 끝 구간
    for(let i =mom; i<= max ; i++){
        if( i % denom1 === 0 && i % denom2 ===0){
            mom = i; // 최소 공배수 갱신
            break;
        }        
    };
    const child = (mom/denom1)*numer1 + (mom/denom2)*numer2; // 분자 계산
    // 기약 분수
    let min = 1
    for(let i =mom; i>1 ; i--){
        if( child % i === 0 && mom % i ===0){
            min = i; 
            break;
        }        
    };
    answer.push(child/min, mom/min); // 분자 분모 
    return answer;
}