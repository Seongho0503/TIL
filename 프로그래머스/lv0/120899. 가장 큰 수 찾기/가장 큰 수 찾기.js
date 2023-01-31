function solution(array) {
    const result = [];
    //const result = new Array(2);
    let num;
    //배열의 탐색
    array.map((x) => {
        num = Math.max(num , x);
    })
    result.push(num);
    result.push(array.indexOf(num));
    return result;
}