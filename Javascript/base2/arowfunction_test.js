// 화살표 함수 에러 테스트
// return문 사라지면 중과호도 사라져야한다 (둘이 세트다)
// 실행문 안에 ;(세미콜론)도 사라져야 한다

let add3 = (num1, num2) => num1 + num2;

//let add3 = (num1, num2) => (num1 + num2);

/*
강의에서는 let add3 = (num1, num2) => (num1 + num2;);
실행문 안에 ; 를 작성하였지만
return문 없어지면 세미콜론도 사라져야 에러가 없어진다
소괄호는 써도 되지만 vscode 확장에 따라서 사라졌다
*/

console.log(add3(2, 3));
