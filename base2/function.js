/*
함수(function) 
: 서비스를 구현하다보면 같거나 비슷한 동작이 생긴다.
(자주 사용하거나 여러곳에서 사용하는것) (하나로 만들어서 재활용)
중복되는 코드도 줄이고 유지 보수도 편해진다.

ex) 팝업을 띄운다, 결재 

브라우저가 이미 가지고 있는 내장함수 : console, alert, confirm

함수(function) Tip
1. 한번에 한작업에 집중 (하나의 함수가 여러작업을 하면 복잡함, 유지 보수 힘듬, 에러잡기 힘듬)
2. 읽기 쉽게 어떤 동작인지 알 수 있게 네이밍 (어떤 동작을 하는지 누구나 이름만 보고 알수 있게 /유추 가능하게)
showError 에러를 보여줌
getName 이름을 얻어옴
createUserDate 유저데이터 생성
checkLogin 로그인 여부 체크

*/

// function sayHello(name) {
//   const msg = `Hello,${name}`;
//   console.log(msg);
// }

/*
function : 함수
sayHello : 함수명 (자유롭게 정할 수 있음)
name : 매개변수(인수) 
*/

console.log("1. 매개변수가 없어도 출력(신기)----------------");
// 로그인을 안했을 때 추가
function sayHello(name) {
  //msg 는 지역변수라 함수내부에서 사용가능, let msg = "Hello"; 를 함수 밖으로 빼주면 함수 밖에서도 msg 사용가능
  //console.log(name);
  let msg = "Hello"; // `Hello` 백틱으로 해도됨 , let으로 설정한 이유는 변경가능하기 때문에
  if (name) {
    // undefined면 false가 됨
    //msg += ", " + name;
    // msg += `, + ${name}`;
    msg = `Hello,${name}`;
  }
  console.log(msg);
}

sayHello();
sayHello("Mike"); //중복을 피함
sayHello("Tom");

console.log("1. 전역 변수와 지역 변수----------------");

let msg2 = "bye"; // 전역 변수(global varable)
console.log("함수호출  전");
console.log(msg2);

function sayBye(name) {
  if (name) {
    // name : 지역변수(local varable)
    msg2 += `, ${name}`;
  }
  //console.log("함수 내부");
  console.log(msg2);
}

//sayBye();
console.log("함수 호출 후");
sayBye("아이유");
//console.log(msg2);

console.log("2. 전역 변수와 지역 변수----------------");

// 매개변수가 없는 함수
// function showError() {
//   alert("에러가 발생했습니다. 다시 시도해주세요");
// }
// showError(); //유지보수가 편함

// 전역 변수와 지역 변수

let msg = "welcome"; //전역변수
console.log(msg); //welcome
function sayHello2(name) {
  let msg = "Hello"; // 지역 변수   , 전역변수와 동일한 이름으로 지역변수 선언가능, 서로 간섭(영향)안 줌
  console.log(msg + " " + name);
}
sayHello2();
sayHello2("Mike"); // Hello Mike
console.log(msg); // welcome

console.log("3. 전역 변수와 지역 변수-----------------");

// 전역 변수와 지역 변수 2번째 예시
let name = "Mike";
function sayHi(name) {
  // name = "Mike" (여기선 let 못붙임)
  console.log(name);
}

// 매변변수로 받은 값은 함수의 지역변수가 된다.
// (함수에 특화된 지역변수를 가급적 사용하기) 지역변수 습관이 좋다 (전역변수는 관리가 힘들어진다.)
sayHi(); // undefined
sayHi("Jane"); //Jane

console.log("4. OR-------------------------");

// OR
function sayHello3(name) {
  let newName = name || "friend";
  let msg = `Hello ${newName}`;
  console.log(msg);
}
sayHello3(); //  Hello friend
/*
매개변수가 없으면 undifined여서 
newNmae의 name이 false
*/

//let newName = "friend" || name;  앞에를 friend로 두면 밑에 두 콘솔은 friend가 뜰거다
sayHello3("Jane"); // Hello Jane

console.log("5 default value (매개변수의 디폴트 값)-------------");

// default value (매개변수의 디폴트 값)
function sayHello3(name = "frined") {
  // 매개변수의 디폴트 값을 이렇게 설정하는 구나 (friend는 name이 없을 때만 할당)
  let msg = `Hello ${name}`;
  console.log(msg);
}
sayHello3(); //  Hello friend
sayHello3("Jane"); // Hello Jane

console.log("6. return으로 값 반환 (return 값이 있을 때) ---------------");
function add(num1, num2) {
  return num1 + num2;
}
const result = add(2, 3);
console.log(result);

console.log(
  "7. return으로 값 반환 (return 값이 없을 때 => undefined 반환) ---------------"
);

function showError() {
  alert("에러가 발생했습니다."); // alert는 return값이 없음
}
const result2 = showError();
console.log(result2); // undefined

console.log("8. return : 함수 즉시 종료  ---------------");

function showError2() {
  alert("에러가 발생했습니다."); // alert는 return값이 없음
  return; // 함수 즉시 종료
  alert("이 코드는 절대 실행되지 않습니다.");
}
const result3 = showError2();
console.log(result3); // undefined
