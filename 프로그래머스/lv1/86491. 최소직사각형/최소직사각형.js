function solution(sizes) {
    const max = [];
    const min = [];
    let size = 0;
    for(const [row,col] of sizes){
        max.push(Math.max(row,col));
        min.push(Math.min(row,col));
    }
    
    size = Math.max(...max) * Math.max(...min);
    return size;
}


// function solution(sizes) {
//     var answer = 0;
//     let row = []
//     let col = []
//     sizes.map( (item) => {  // map, foreach 
//         item.sort((a,b) => { // 정렬 (오름차순)
//              return b-a
//         })
//         row.push(item[0]) // 큰 값
//         col.push(item[1]) // 작은값
//     })
//     const rMAX = Math.max(...row)
//     const cMAX = Math.max(...col)
//     answer = rMAX*cMAX
//     return answer;
// }


// var numbers = [4, 2, 5, 1, 3];
// numbers.sort(function(a, b) {
//   return a - b;
// });
// console.log(numbers);

// [1, 2, 3, 4, 5]