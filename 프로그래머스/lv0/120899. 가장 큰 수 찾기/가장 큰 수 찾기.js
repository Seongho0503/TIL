function solution(array) {
    const result = [];
    //const result = new Array(2);
    let num = 0; // null 도 통과 0도 통과 대신 할당 안하면 undefied임
    //배열의 탐색
    array.map((x) => {
        num = Math.max(num , x);
    })
    result.push(num);
    result.push(array.indexOf(num));
    return result;
}