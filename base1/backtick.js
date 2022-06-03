const name = "Mike"; // 문자형 String
const age = 30;

const name1 = "Mike";
const name2 = "Mike";
// 큰 따옴표와 작은 땀옴표는 큰 차이없다
const name3 = `Mike`;

// 작은 따옴표 쓰고 싶은면
const message = "I'm a boy"; // 큰 따옴표로 감싸기
const message2 = "I`m a boy"; // 역 슬래쉬 앞에 넣어주면 특수문자로 인식

//정규식
const message3 = `My name is ${name}`;
// 달러와 중괄호 사이에 변수를 넣어주면
console.log(message3);

// 표현식
const message4 = `나는 ${30 + 1}살 입니다`;
console.log(message4);

// 문자열 사이에 변수만 따로 구분할 수 있게 해서 좀 더 직관적으로 볼 수 있다.

const num1 = 10;
const num2 = 20;

console.log(`${num1} + ${num2} = ${num1 + num2} 입니다.`);

// 백픽 주의
const nickname = "Mike";
const message5 = `My name is ${nickname}`;
console.log(message5);

// 일반 따옴표는 변수명이 그대로 노출됨 => ` 백틱만 써야함
const message6 = "My nameis ${nickname}";
console.log(message6);
