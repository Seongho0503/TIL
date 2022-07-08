import { useState, useEffect } from "react";

function App3() {
  const [counter, setValue] = useState(0);
  const [keyword, setKeyword] = useState("");
  const onClick = () => setValue((prev) => prev + 1);
  const onChange = (event) => {
    setKeyword(event.target.value);
  };
  console.log("i run all the time");
  useEffect(() => {
    console.log("i run only once");
  }, []);
  useEffect(() => {
    if (keyword !== "" && keyword.length > 5)
      //keyword가 빈 값이 아닐 때
      console.log("Serch for", keyword);
  }, [keyword]);
  useEffect(() => {
    console.log("i run when 'counter'  changes.");
  }, [counter]);

  useEffect(() => {
    console.log("something is changes.");
  }, [counter, keyword]);

  return (
    <div>
      <input
        value={keyword}
        onChange={onChange}
        type="text"
        placeholder="Search here"
      />
      <h1>{counter}</h1>
      <button onClick={onClick}>Click me</button>
    </div>
  );
}

export default App3;
