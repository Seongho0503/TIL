//import "./App.css";
import Container from "./Container";
import Counter from "./Counter";

function App() {
  const counterProps = {
    a: 1,
    b: 2,
    c: 3,
    initialValue: 5,
  };

  return (
    <Container>
      <div>
        <Counter {...counterProps} />
      </div>
    </Container>
  );
}

export default App;
