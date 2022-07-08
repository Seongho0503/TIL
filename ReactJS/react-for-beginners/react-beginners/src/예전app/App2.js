import Button from "../Button";
import styles from "./App.module.css";

function App2() {
  return (
    <div>
      <h1 className={styles.title}>hello!</h1>
      <Button text="Continue" />
      <Button text="finish" />
    </div>
  );
}

export default App2;
