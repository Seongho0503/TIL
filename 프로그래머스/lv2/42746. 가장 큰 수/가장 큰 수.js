function solution(numbers) {
    var answer = '';
    // sort((a,b) => (b+a)-(a+b)) = 문자로 변환된 숫자를 연결하여 비교정렬 ( '3', '30' => ('303')-('330'))
    const highNum = numbers.map(c => c + "").sort((a,b) => (b+a) - (a+b)).join("");
    //console.log(highNum)
    // numbers.toString(); 	[6, 10, 2] => 	"6210"
    //answer = numbers[0].toString().split("")
    
    return highNum[0] === '0' ? '0' : highNum;
}