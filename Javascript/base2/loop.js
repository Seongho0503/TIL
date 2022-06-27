// 반복문 (loop) : 동일한 작업을 여러번 반복
// 명확한 횟수가 정해져있으면 for문 그게아니면 while문
// do-while은 자주 사용 안함
// 개발자는 코드를 줄이기 위해 노력해야함 . 그래야 성능이 좋아짐

// 1부터 10까지 로그를 찍어주세요

//for (초기값; 조건)
//초기값: 처음 한번만 설정
//조건 : 매 반복때 마다 조건확인 후 false가 되면 멈춤
//코드 실행 후 작업
// for (let i = 0; i < 10; i++) {
//   //반복할 코드
//   console.log(i + 1);
// }

// while 반복문
// let i = 0;
// while (i < 10) {
//   //코드
//   console.log(i);
//   i++;
// }

// do..while 반복문
// 조건문을 아래로 옮김
// while과 다른점이 코드를 1번은 반드시 실행하고 조건체크함

// let i = 0;
// do {
//   //코드
//   i++;
// } while (i < 10);

// 반복문을 빠져나올 때
// break, continue

// break: (만나는 즉시 반복문을) 멈추고 빠져나옴
// contuinue : (코드 실행을 멈추고) 다음 반복으로 진행 (반복문 빠져나오지 X)

// while (true) {
//   //무한반복은 특정 조건이 되었을 때 break 해주는 것이 매우 중요
//   let answer = confirm("계속 할까요?");
//   if (!answer) {
//     // 뜻 : answer가 false이면(= confirm에서 취소누르면) 실행 => 멈춤
//     break;
//   }
// }

console.log(13 % 5);
// expected output: 3

console.log(-13 % 5);
// expected output: -3

// continue
// 짝수만
for (let i = 0; i < 10; i++) {
  if (i % 2) {
    // 2로 나눴을때 나머지가 1이면 if문 들어감
    continue;
  }
  console.log(i); // 짝수만 찍힘
}

/*
기본적으로  true 값은 0 혹은 null  제외한 값입니다.
false 값은 0 or null 이기 떄문에
3%2 = 1 이므로
1은 0혹은 null 이 아니기 떄문에 true로 판단됩니다.
2%2 = 0 이므로
false가 적용되어
console.log 값이 나옵니다.
*/

// switch문
// if-else문을 알고 있다면 몰라도 된다 (if-else로 switch문을 대체가능)
// 장점 : case가 다양할경우 보다 강렬하게 사용가능

// 두 개 똑같음

// switch (평가) {
//     case A:
//         //A일때 코드
//     case B:
//         //B일때 코드
// }

// if (평가 == A) {
//     //A일때 코드
// } else if (평가 == B) {
//     //B일 때 코드
// }

// 바나나 : 200원
// 키위 : 300원
// 멜론 : 500원
// 수박 :500원
// 사고 싶은 과일을 물어보고 가격 알려주기

let fruit = prompt("무슨 과일을 사고 싶나요?");
// case는 if문
// default는 else문
// 여기 없는 과일을 입력하면 아무일도 안 생김 = > else 같은 역할 => default
switch (fruit) {
  case "사과":
    console.log("100원 입니다.");
    break;
  case "바나나":
    console.log("200원 입니다.");
    break;
  case "키위":
    console.log("300원 입니다.");
    break;
  case "멜론": // 멜론과 수박은 같은 가격
  case "수박":
    console.log("400원 입니다.");
    break;
  default:
    console.log("그런 과일은 저희가게에 없습니다.");
}
