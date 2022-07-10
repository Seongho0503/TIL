import { useState } from "react";
import OddEvenReasult from "./OddEvenResult";

function Counter() {
  const [count, setCount] = useState(0);

  const onIncrease = () => {
    setCount((current) => current + 1);
  };

  const onDecrease = () => {
    setCount((current) => current - 1);
  };

  return (
    <div>
      <h2>{count}</h2>
          <OddEvenReasult count={count} />
      <button onClick={onIncrease}>+</button>
      <button onClick={onDecrease}>-</button>
    </div>
  );
}

Counter.defaultProps = {
  initialValue: 0,
};
export default Counter;
