// function과 object 같이 이용
// 이름과 나이를 받아서 객체 반환하는 함수

function makeObject(name, age) {
  return {
    name: name, // 받아온 이름
    age: age, // 받아온 나이
    hobby: "football",
  };
}

const Mike = makeObject("Mike", 30);
console.log(Mike);

function makeObject2(name, age) {
  return {
    name, // 축약형으로 가능
    age, // 축약형으로 가능
    hobby: "football",
  };
}

// 나이를 입력받아 성인인지 아닌지 확인
function isAdult(user) {
  //user 객체를 받음
  if (user.age < 20) {
    return false; //성인이 아니다
  }
  return true;
}
const Jack = {
  name: "Jack",
};
console.log(isAdult(Jack)); // Jack은 나이가 없는데도 true가 나온다(중요)

// key in Object
let user = { name: "John", age: 30 };

alert("age" in user); // user.age가 존재하므로 true가 출력됩니다.
alert("blabla" in user); // user.blabla는 존재하지 않기 때문에 false가 출력됩니다.

const Jin = {
  name: "Jin",
  age: "23",
};

console.log(isAdult(Jin)); // true

console.log("-----------문제해결---------");

// 나이를 입력받아 성인인지 아닌지 확인
function isAdult(user) {
  //user 객체를 받음
  if (
    !("age" in user) || // user에 age가 없거나
    user.age < 20 // 20살 미만이거나
  ) {
    return false; //성인이 아니다
  }
  return true;
}

console.log(isAdult(Jin)); // true
console.log(isAdult(Jack)); // 이제야 false가 나옴
