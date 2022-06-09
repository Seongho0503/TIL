/*
함수 선언문 vs 함수 표현식

함수 선언문
function sayHello(){
    console.log('Hello')
}

함수 표현식 : 이름이 없는 함수로 만들고 변수에 할당
let sayHello = function(){
    console.log('Hello')
}
*/
let sayHello = function () {
  console.log("Hello");
};
sayHello(); // 공통점 : 함수 선언문과 함수 표현식은 사용방법과 동작방식은 동일

/*
차이점 : 작성하는 문법과 호출하는 타이밍!!!!

함수 선언문 : 어디서든 호출 가능

let sayHello = function(){
    console.log('Hello')
}
sayHello();  
위의 코드의 순서를 바꿔도 동작함

sayHello(); ----------------------- 위로 바꿈

let sayHello = function(){
    console.log('Hello')
}

여기서 의문 
: 자바 스크립트는 위에서 아래로 차례대로 한줄씩 읽는 
순차적으로 실행하고 즉시 결과를 반환하는 프로그램
=> 인터프리터 언어(Interpreted language)

자바스크립트는 인터프리터 언어인데 어떻게 저 코드가 실행될 수 있는거지??

*/

console.log(num); // 이 콘솔에 1이 찍힐까?? => No!!!!  (Error.num is not defined)
let num = 1;

/*
그런데 함수 선언문은 어떻게 실행될 수 있었던 걸까?
=> 이건 자바스크립트 내부 알고리즘 때문이다.

자바스크립트는 실행전 코드의 모든 함수 선언문을 찾아서 생성해둔다(선언된 함수 모임)
함수 선언문으로 작성된 함수는 코드의 위치에 맨 위에 있다. (실제 위로 올라간다는 의미가 아니다)
=> (이를) 호이스팅(hoisting) (이라고 부름) 


*/

/*
반면에 함수표현식은 호이스팅으로 호출 안된다.
함수 표현식 : 코드에 도달하면 생성
함수 표현식으로 생성되고 나서 함수 사용가능

*/
