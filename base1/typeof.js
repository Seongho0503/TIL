//typeof 연산자
/*
- 다른 개발자가 만든 변수의 타입을 알아야하거나
- API 통신으로 받아온 데이터를 타입에 따라 다른 방식으로 처리해야할 때
*/

const name = "Mike";

console.log(typeof 3); // number
console.log(typeof name); // string
console.log(typeof true); // boolean
console.log(typeof "xxx"); // string
console.log(typeof null); // Object 객체형
console.log(typeof undefined); // undefined

/*
null은 객체가 아니다

*/
