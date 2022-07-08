import { useState, useEffect } from "react";
function Hello() {
  //1번째 방법
  // function byFn() {
  //   console.log("bye : (");
  // }
  // function hiFn() {
  //   console.log("created");
  //   return byFn;
  // }
  //useEffect(hiFn, []);
  // 가장 많이 쓰는 2번째 방법

  useEffect(() => {
    console.log("hi");
    return () => console.log("bye");
  }, []);

  // 3번째 방법
  // useEffect(function () {
  //   console.log("hi");
  //   return function () {
  //     console.log("bye");
  //   };
  // });
  return <h1>Hello</h1>;
}
function App() {
  const [showing, setShowing] = useState(false);
  const onClick = () => setShowing((prev) => !prev);
  return (
    <div>
      {showing ? <Hello /> : null}
      <button onClick={onClick}>{showing ? "Hide" : "Show"}</button>
    </div>
  );
}

export default App;
