/*
String() -> 문자형으로 변환
Number() -> 숫자형으로 변환
            // 숫자가 아닌 문자면 Number("문자") => NaN
            // Number(null) => 0
            // Number(undefined) => NaN
Boolean() -> 불린형으로 변환
            // 0, ""(빈 문자열) ,undefined, NaN => false

응용퀴즈)
const age = prompt("나이는?") 일 때 취소 버튼을 누르면 null값이 age에 저장된다
Number(age)를 하면 0이된다. 





형 변환이 왜 필요할까?

"Hello" + "world" = "Hello world"
문자열 + 문자열 = 문자열

100 + 200 = 300

"100" +200 =???
자료형이 다르면 문제가 생김 
*/

//수학과 영어점수를 입력받아 평균을 작성하는 프로그램
//const mathScore = prompt("수학 몇점?");
//const engScore = prompt("영어 몇점?");

// 곱셈과 나누셈은 덧셈과 뺄셈보다 우선 계산(연산자 우선순위)
// const result = mathScore + engScore / 2;  이렇게 코드 짜면 나누기 2가 먼저 됨
//const result = (mathScore + engScore) / 2; //이렇게 코드 짜면 나누기 2가 먼저 됨
//console.log(result);

// 수학 90 + 영어 80 점하면  9080 /2 4540이 나옴
// prompt로 입력받은 값은 문자열이다. (매우 중요)
// 문자 + 문자 는 문자들을 이어주기다.
// 여기서 문제
// "9080"을  /2하면 =4540이 나왔다
// 어떻게 문자열을 나누기 2 할 수 있었던걸까??

// 나누기 같은 경우에는 숫자형으로 자동형변환됨!!!!!!!!!! (매우 중요)

//ex) "6" / "2" = 3  <-- 자동형변환
// 자동형변환은 편해보이지만 원인이 모르는 에러를 발생시킬 수 있음 (위험)

// (반대는) 명시적 형변환 : 의도적으로, 목적을 가지고 형변환 (매우 안전)

// const mathScore2 = 50;
// const engScore2 = 80;
// const result2 = (mathScore2 + engScore2) / 2;
// console.log(result2);

// 주의 : prompt로 입력받은 값은 문자열이다.

// 명시적 형변환
// - 앞에 대문자로 작성하기
// String()은 괄호안에 타입을 문자열로 바꿔준다

console.log(
  String(3),
  String(true),
  String(false),
  String(null),
  String(undefined),
  typeof String(undefined)
);

//console.log는 ,(쉼표)로 여러가지 값을 한 번에 찍어볼 수 있다.
// "3" "true" "false" "null" "undefined" 원래 이렇게 나와야하는데 vscode이상하네

//Number  도 대문자로 작성하기
// -사용자에게서 입력받은 값이 문자열일 때 자주 사용

console.log(
  Number("1234"),
  Number("12313sadsadsad"), // NaN   (글자가 있으면) NaN
  Number(null), // 0
  Number(undefined), // NaN
  Number(true), // 1 (중요)
  Number(false) // 0  (중요)
  //true와 false를 Number()로 형변환 시키면 1(true), 0(false)
);

//Bollean()
// false가 되는 경우 5가지
// - 숫자 0 , 빈 문자열 "" , null , undefined, NaN
// 이 외에는 모두 ture 반환

console.log(
  Boolean(0), // 숫자 0
  Boolean(""), // 빈 문자열
  Boolean(null),
  Boolean(undefined),
  Boolean(NaN),
  Boolean(0), // false (숫자0)
  Boolean("0"), // true (문자열 0)
  Boolean(""), //false  (빈 문자열)
  Boolean(" ") //true   (공백이 들어가 있으면)
);
