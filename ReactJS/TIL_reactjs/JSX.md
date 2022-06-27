# O. JSX 등장 배경
- createElement를 대체하기 위한 편리한 방법

# 1. JSX란?
- JavaScript를 확장한 문법
- HTML랑 문법 비슷

# 2. JSX와 createElement 비교
![image](https://user-images.githubusercontent.com/86208370/175918373-74093dbc-343f-4f88-b0ac-ae23031b6076.png)
![image](https://user-images.githubusercontent.com/86208370/175920620-935de35f-80cd-47d9-bfaf-a72888690c9d.png)

1. HTML 태그를 열고 닫음
2. 그 사이에 content(내용) 담음
3. onMouseEnter는 마치 태그가 가진 하나의 속성인 것처럼 추가
4. props에서 객체로 들어가는 경우 {} 중괄호 넣어야함
 - event Listener는 {} 중괄호 1개
 - style은 {{}} 중괄호 2개

# 3. Babel 
![image](https://user-images.githubusercontent.com/86208370/175921499-609ac558-992c-4d97-a051-d7ac8860cf93.png)

- 코드 인식을 못해서 변환해줘야함 : Babel
- Babel : 코드를 변환해줌
- JSX로 적은 코드를 브라우저가 이해할 수 있는 형태로 바꿔 줌
- 브라우저는 JSX를 모르니깐
- Babel 사이트 
https://babeljs.io/
