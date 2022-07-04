# 환경
- create react app

# 에러 내용
![image](https://user-images.githubusercontent.com/86208370/177182224-c9d14487-3028-4846-8e44-0fa80055ac57.png)

- propTypes 설정 에러
```
import PropTypes from "prop-types";

function Button({ text }) {
  return <button>{text}</button>;
}

Button.PropTypes = {   <--------------------- 에러 난 부분 (대문자롤 소문자로 바꿔야함)
  text: PropTypes.string.isRequired,
};
export default Button;

```

# 해결
- 밖에는 propType 소문자이고 안에는 대문자이다.
```
 import PropTypes from "prop-types";

function Button({ text }) {
  return <button>{text}</button>;
}

Button.propTypes = {
  text: PropTypes.string.isRequired,
};
export default Button;

```
