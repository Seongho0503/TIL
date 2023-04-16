function solution(numbers) {
    var answer = '';
    const newArr = numbers.map(e => e + "").sort((a,b) => (b+a) - (a+b)).join("");
    //console.log(newArr);
    return Math.max(...numbers) === 0 ? "0" : newArr;
}