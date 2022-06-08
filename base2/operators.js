/*

+ 더하기
- 빼기
* 곱하기
/ 나누기
% 나머지

- 나머지 (%)를 어디에 쓸까?

1. 나머지가 1인지 0인지에 따라 홀수, 짝수를 알 수 있다.
홀수 : X % 2 = 1
짝수 : Y % 2 = 0

2. 어떤 값이 들어와도 5를 넘기면 안돼
X % 5 = 0~4 사이의 값만 반환
*/

//- 거듭 제곱 (*별 2번적기)
const num = 2 ** 3;
console.log(num); //8

//우선순위
// */  > +-
// 곱셈과 나눗셈은  덧셈과 뺄셈보다 우선순위가 높다
// 원하는 결과를 얻기 위해서는 괄호를 적절히 사용한다

// 연산자 줄여서 쓰기
let num2 = 10;
num2 = num2 + 5;
console.log(num2);
num2 += 5; //위와 동일
console.log(num2);
num2 *= 5;
console.log(num2);
num2 -= 5;
console.log(num2);
num2 /= 5;
console.log(num2);
num2 %= 5;
console.log(num2);

// 증가 연산자, 감소 연산자
let num3 = 10;
num3++;
console.log(num3);
num3--;
console.log(num3);

//중요
let num4 = 10;
let result = num4++; // result 에 10 할당하고 증가연산자에 의해 1 증가하니깐
console.log(result); //10이 찍힘

result = ++num4;
console.log(result); // 12 찍힘

// 비교연산자, 조건문
//  <(크다)  >(작다)  <=(크거나 같다)  >=(작거나 같다) ==(같다,!! 매우중요 = 2개 쓴다) !=(다르다)
// 비교연산자의 결과는 true, false 만 반환한다.

// a=3; 할당연산자
// a==3; a랑 3이랑 같은가
// a!=3; a랑 3이랑 다른가

// == (=2개 쓰는것을 동등연산자라 부름)
// === (=3개 쓰는것을 일치연산자라 부름)
console.log(10 > 5, 10 == 5, 10 != 5);

// 동등연산자 주의사항
const a = 1;
const b = "1";
console.log(a == b); //true가 나온다, 숫자형과 문자형을 비교했는데 (버그 생길 수 있음)
console.log(a === b); // false가 나온다, === =이 3개면 type까지 비교한다. (권장!!!)

//비교 연산자를 왜 배울까?? -> 조건문
// if문 괄호가 true면 실행
// if문의 괄호형은 boolean형이 반환 /(true. false)

const age = 19;
if (age > 19) {
  console.log("환영합니다");
}

if (age <= 19) {
  console.log("몇년 뒤에 오세요");
}

// if - else
// else는 if문이 false일때 실행됨
if (age > 19) {
  console.log("환영합니다");
} else {
  console.log("몇년 뒤에 오세요");
}

// if -else if - else
// 추가요구사항 : 19살이면 수능 잘 치세요 문구
if (age > 19) {
  console.log("환영합니다");
} else if (age === 19) {
  console.log("수능잘치세요");
} else {
  console.log("몇년 뒤에 오세요");
}

// 논리연산자 3가지
// ||(OR)  &&(AND)  !(NOT)

// ||(OR) : 여러개 중 하나라도 ture 면 true, 즉 모든값이 false일때만 false를 반환
// &&(AND) : 모든 값이 ture면 true, 즉 하나라도 false면 false를 반환
// !(NOT) : true면 false, false면 true  (반대 값으로 바꿔줌)

// 평가 (복잡한 조건 전에 간단한 조건먼저 평가시키기) (조건의 순서 중요)
// OR는 첫뻔째 ture를 발견하는 즉시 평가를 멈춤 (앞에가 ture면 뒤에 조건 안보고 바로 true)
// AND는 첫번째 false를 발견하는 즉시 평가를 멈춤 (앞에가 false면 뒤에 볼 필요 없이 false)

//조건순서 중요 (평가) : 성능 최적화
// 조건 : 운전면허가 있고 시력이 좋은 여군
// 운전면허 : 전체 군인의 80%
// 시력 : 전체 군인의 60%
// 여군 : 전체 군인의 7%
// => 여군인데 시력이 좋고 운전면학 있는 사람
// 첫번째 조건에서 93%를 걸려낼 수 있으니

// OR
// 이름이 TOM이거나 , 성인이면 통과
const name = "Mike";
const age2 = 10;

if (age2 > 19 || name === "Tom") {
  console.log("통과");
} else {
  console.log("돌아가");
}

// 나이를 입력받아 성인 아니면 돌아가라고...
const isAdult = prompt("나이를 입력하세요");
if (isAdult > 19) {
  console.log("통과");
} else {
  console.log("돌아가");
}
