/*
 Object
 Superman
 name : clark
 age : 33
을 객체로 만들면
 */

const superman = {
  name: "clark", // 프로펄티가 여러개 일때 쉼표 반드시 붙여야 함
  age: 33,
};
// name, age를 property라 부른다
//property는 해당 object의 특징입니다.
// 각 property는 ,(쉼표)로 구분한다. (마지막 쉼표는 없어도 되지만 있는게 수정, 삭제 용이)
// property는 key와 value로 이루어진다.
// 키(key) : name
// 값(value) : clark

// 객체 - 접근, 추가 , 삭제

/*
<객체의 접근>
객체의 접근은 .(점)과 [] 대괄호
객체 속성접근자 Object Property Accessors
점 표기법(Dot Notation) 이며, 두번째 방식은 괄호표기법(Bracket Notation) 이라고한다.
*/
superman.name; // 'clark'
console.log(superman.name);
superman["age"]; // 33
console.log(superman["age"]);

/*
<객체의 추가>
객체의 추가도 (객체의 접근과 똑같이) .(점)과 [] 대괄호로 접근함
*/
superman.gender = "male";
console.log(superman.gender);
superman["hairColor"] = "black";
console.log(superman["hairColor"]);

/*
<객체의 삭제>
delete 키워드 사용
삭제하고 싶은 property 앞에 붙이기
*/
console.log("-------원래 superman");
console.log(superman);
console.log("-------age 대괄호 표기법으로도 지워질까?");
delete superman["age"];
console.log(superman);
console.log("-------hairColor없애기");
delete superman.hairColor; // 삭제
console.log(superman["hairColor"]); // 삭제후 출력하면 => undefined
console.log(superman); // 객체를 출력해보면 아예 hairColor property가 사라졌음을 확인가능하다

/*
Object - 단축 프로퍼티

*/
const name = "clerk";
const age = 33;

const spiderman = {
  name: name,
  age: age,
  gender: "male",
};

const spiderman2 = {
  name, //여기 중요
  age, // 위랑 비교
  gender: "male",
};

// spiderman 1 ,2나 동일한 표기법임

console.log(spiderman, spiderman2);

/*
Object - 프로퍼티 존재 여부 확인
존재하지 않는 프로퍼티에 접근하면 에러가 발생하지 않고 => undefined가 나옴
in 연산자를 사용하면 프로퍼티 존재 여부 확인 가능
false(존재X) , true(존재) 값으로 

언제 in을 쓸까요?
어떤 값으로 넘어올지 확신이 없을때
함수 인자로 받거나
api 통신으로 받을 때
*/
superman.birthDay;
console.log(superman.birthDay); // undefined

"birthDay" in superman;
console.log("birthDay" in superman); // false

"age" in superman;
console.log("age" in superman); //true

/*
for... in 반복문 
: 객체를 순회하면서 값을 얻을 수 있다
*/

for (let key in superman) {
  console.log(key);
  console.log(superman[key]);
}
