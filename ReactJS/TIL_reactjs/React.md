테스트 시에, act 경고가 옵트인 됨
e2e 테스트 시 act 경고는 불필요하다. opt-in 개념을 도입하여 유닛테스트 시에만 이러한 경고문을 받을 수 있도록 구성할 수 있다.

No Suppression of console.log
strict 모드에서, 각 컴포넌트를 두번씩 렌더링 하면 예끼치않은 사이드 이펙트를 겪을 수 있다. react 17에서는 이러한 로그를 쉽게 읽게 하기 위해 두 렌더링 중에 하나의 console.log를 의도적으로 띄우지 않았다. 그러나 이러한 동작이 혼란스럽다는 의견이 있어 더이상 경고문을 제거하지 않는다. 대신, React DevTools가 설치되어 있다면, 두번째 로그가 회색으로 표시되고, 이를 완전히 없앨 수 있는 옵션이 존재한다.

메모리 사용량 최적화
리액트는 마운트 해제시에 더 많은 내부 필드를 정리하여, 애플리케이션에 존재할 수 있는 메모리 누수로 인한 영향을 줄여주었다.

React DOM Server
renderToString
서버에서 suspending이 일어날 경우 더이상 에러가 발생하지 않는다. 대신 가장 가까운 <Suspense> 바운더리에 fallback HTML을 내보낸후, 클라이언트 레벨에서 같은 렌더링을 재시도 한다. renderToString보다는 renderToPipeableStream renderToReadableStream과 같은 스트리밍 api로 전환하는 것을 추천한다.

renderToStaticMarkup
서버에서 suspending이 일어날 경우 더이상 에러가 발생하지 않는다. 대신 가장 가까운 <Suspense> 바운더리에 fallback HTML을 내보낸 후, 클라이언트 레벨에서 같은 렌더링을 재시도 한다.

  return (
    <div className="App">
      <DiaryEditor onCreate={onCreate} />
      <DiaryList onEdit={onEdit} onRemove={onRemove} diaryList={data} />
    </div>
  );
};
export default App;
