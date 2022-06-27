# React.createElement의 내부 배치
![image](https://user-images.githubusercontent.com/86208370/175912242-87ca9649-f60c-42d4-bbf8-75b67cd7523b.png)
![image](https://user-images.githubusercontent.com/86208370/175914028-79eb2dd8-da5e-4c21-9c2d-684ca5e3ce40.png)



# 1. 첫 번쨰 argument : root 안에 들어갈 HTML 태그
# 2. 두 번째 argument : props가 포함된 object
- props : property
- 일반적인 HTML tag의 property로 부터 무엇이든지 바꿀 수 있다
- id, class, style[색], placeholder, <h3> event listener!! <h3> 등등
- 없으면 null 로 둔다
# 3. 세 번째 arument : content
