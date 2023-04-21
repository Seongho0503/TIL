
# 01. TIL 소개
## 📝Today I Learned 
Today I Learned. 그날 그날 모든 활동들을 정리

- 알고리즘 
- SQL

# Algorithm

### 1) 문자열 활용
  - 스킬 트리 ([PGS 문제](https://school.programmers.co.kr/learn/courses/30/lessons/49993) /  [블로그 JS 풀이](https://maystar8956.tistory.com/182) )
  ```
  filter 
  ```
  
### 2) BFS 
   - 게임 맵 최단거리 ([PGS 문제](https://school.programmers.co.kr/learn/courses/30/lessons/1844) /  [블로그 JS 풀이](https://maystar8956.tistory.com/178) )
  ```
 일반적인 BFS : 큐와 visited 배열 사용
  ```
  
### 3) DFS 
 
 
### 4) 일차원 배열의 활용


### 5) 이차원 배열의 활용
   - 삼각달팽이 ([PGS 문제](https://school.programmers.co.kr/learn/courses/30/lessons/68645) /  [블로그 JS 풀이](https://maystar8956.tistory.com/183) )
  ```
패턴 파악 : 단계별로  n-1씩 줄어듬
정삼각형 -> 직각삼각형
  ```
  
 ### 6) 그리디[탐욕 알고리즘]
 ```
 1. 정렬이 핵심 (정렬 기준 정하기 : 어떤 것을 오름차순, 내림차순 할지)
 2. 최적해가 있다고 가정
 3. DP보다 빠를 수 있음 (DP의 자식같은 유형)

<그리디 조건> 
- 지금의 선택이 최선이 될것
- 현재의 선택이 다음 선택에 영향 없을 때
- 입력 값이 엄청 클 때 (완탐으로 돌리면 시간 초과)
 ```
 - 예산 ([BOG 문제, L1](https://school.programmers.co.kr/learn/courses/30/lessons/12982) / [내 코드](프로그래머스/lv1/12982. 예산/예산.js) / [블로그 JS 풀이](아직없음) )
```
- 문제에서 요구하는 건 정확한 조합 값이 아니다
- 최대의 개수만 구하면 된다
- budget은 예산을 나타내며, 1 이상 10,000,000 이하의 자연수입니다. (인풋 값이 길다 => 완탐 불가) 
```
  
