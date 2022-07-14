import "./App.css";
import DiaryEditor from "./DiaryEditor";
import DiaryList from "./DiaryList";

const dummyList = [
  {
    id: 1,
    author: "이정환",
    content: "하이 1",
    emotion: 5,
    created_date: new Date(),
    // new Date() : 현재시간 / new Date().getTime() [millisecond로 변환]
  },
  {
    id: 2,
    author: "권성호",
    content: "하이 2",
    emotion: 4,
    created_date: new Date(),
    // new Date() : 현재시간 / new Date().getTime() [millisecond로 변환]
  },
  {
    id: 3,
    author: "이재환",
    content: "하이 3",
    emotion: 3,
    created_date: new Date(),
    // new Date() : 현재시간 / new Date().getTime() [millisecond로 변환]
  },
  {
    id: 4,
    author: "김필재",
    content: "하이 4",
    emotion: 4,
    created_date: new Date(),
    // new Date() : 현재시간 / new Date().getTime() [millisecond로 변환]
  },
];

function App() {
  return (
    <div className="App">
      <DiaryEditor />
      <DiaryList diaryList={dummyList} />
    </div>
  );
}

export default App;
