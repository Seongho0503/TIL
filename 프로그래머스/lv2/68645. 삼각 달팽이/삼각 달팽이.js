function solution(n){
    // 2차원 배열을 만들고, 각 행은 해당 행 번호에 해당하는 열 수를 가집니다.
    const triangle = new Array(n).fill().map((_, idx) => new Array(idx+1));
    
    let count = 0; // 숫자
    let x = -1;
    let y = 0;
    
    while(n > 0){
        // n의 개수에 주목
        // 아래 -> 오른쪽 - > 대각선 위로 갈수록 n이 하나씩 줄어든다. (그림 참고)
        for(let i = 0; i < n; i++) triangle[++x][y] = ++count; // 아래
        for(let i = 0; i < n- 1 ; i++) triangle[x][++y] = ++count; // 오른쪽
        for(let i = 0; i < n -2; i++) triangle[--x][--y] = ++count; // 대각선 위로
        
        n -= 3;
    }
    //console.log(triangle);
    return triangle.flatMap(e => e);
    // triangle 배열 내의 모든 하위 배열(e)을 하나의 배열로 평탄화 [1차원 배열로]
    
  // [ 1 ],
  // [ 2, 12 ],
  // [ 3, 13, 11 ],
  // [ 4, 14, 15, 10 ],
  // [ 5, 6, 7, 8, 9 ]
    
}


// function solution(n) {
//     var answer = [];
//     let count = "*";
//     let num = 1
//     // n x n 정사각형 만들기
//     const triangle = Array.from(Array(n), () => Array(n).fill(0));
//     //console.log(triangle);
//     // 별찍기
//     for(let i = 0; i < n; i++){
//         star = "";
//         for(let j = 0; j <= i; j++){
//          triangle[i][j] = count;
//         }
       
//     }
//     // 숫자가 채워지는 순서는 : 아래 -> 오른쪽 -> 위 (반복) ,왼쪽 없음
//     const next = [[0,1], [1,0], [-1,-1]];
//     const cur = [0,0]
//     while(num < 10){
//       let cnt = 1;
//         for(nx of next){ // in x
//             let direct = 0;
//             triangle[cur[1]][cur[0]] = num;
//             while(direct < n-cnt ){
//                 direct++;
//                 cur[0] = cur[0] + nx[0]; 
//                 cur[1] = cur[1] + nx[1];
//                 //console.log(cur)
//                 if(triangle[cur[1]][cur[0]] === "*"){
//                     triangle[cur[1]][cur[0]] = ++num;    
//                 }
//             }

//         }   
//     console.log(triangle);
//     return answer;
// }