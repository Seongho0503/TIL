//method  this

// method : 객체 프로퍼티로 할당 된 함수
const superman = {
  name: "clark",
  age: 33,
  fly: function () {
    // 하늘을 나는 능력(메소드 추가)
    console.log("날아갑니다");
  },
};

superman.fly();
//날아갑니다.

// method 단축 구문으로 나타내기
const superman2 = {
  name: "clark",
  age: 33,
  fly() {
    // function 키워드 생략
    console.log("날아갑니다");
  },
};

// method에 객체의 프로퍼티 넣기
const user = {
  name: "Mike",
  sayHello: function () {
    console.log(`Hello, I'm ${this.name}`); // ${user.name} 으로 하면 오류가 생길 수 있음
  },
};

user.sayHello();
// user는 위에 this가 됨

console.log("test2---------------------");

// 변수와 상수, 함수 이름들을 식별자라고 합니다
sayHello = function () {
  console.log(`Hello, i'm ${this.name}`);
  //this는 실행하는 시점(RUNTIME) 때 결정된다
};

let boy = {
  name: "Mike",
  sayHello, // 객체의 메소드로 넣어둠
};

let girl = {
  name: "Jane",
  sayHello,
};

boy.sayHello();
girl.sayHello();
// sayHello의 객체는 점 앞에 있는 객체 boy , girl

// 메서드 에서의 차이
