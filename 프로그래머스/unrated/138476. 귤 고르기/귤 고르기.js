function solution(k, tangerine) {
    // 서로 크기가 다른 귤 객체
    const sizes = {};
    // key(해당 귤 크기)가 없으면 추가, 있으면 기존 개수 증가
    tangerine.forEach((it, idx) => sizes[it] ? sizes[it]++ : sizes[it] = 1);
    // 객체의 value 값(귤 개수만 가져옴)
    const fruits = Object.values(sizes);
    
    // 내림차순 정렬 (귤 종류를 최소화려면 많은 귤 종류부터 채워야 함)
    fruits.sort((a,b) => b-a);
    
    // 총 귤 개수
    let sum = 0;
    // 귤 종류
    let count = 0;
    
    // 최소 귤 개수 반복문으로 확인
    for(let fruit of fruits ){
        sum += fruit;
        count++;
        if(sum >= k) return count
        
    }
    
    
    
}





// function solution(k, tangerine) {
//     const obj = {}
//     // 입력받은 귤배열을 객체의 키 값으로 삼는다
//     tangerine.forEach((a, i) => obj[a] ? obj[a]++ : obj[a] = 1);
//     // value 값 담을 배열
//     const arr = Object.values(obj);
//     // 오름차순 정렬
//     arr.sort((a, b) => b - a);
//     // 귤의 개수
//     let num = 0;
//     // 서로 다른 종류의 수의 최솟 값
//     let answer = 0;

//     for (let x of arr) {
//         num += x;
//         answer++;
//         if (num >= k) return answer;
//     }

// }



// function solution(k, tangerine) {
//     const counts = {};
//     tangerine.forEach(v => counts[v] = (counts[v] ?? 0) + 1);
//     const sortedCounts = Object.values(counts).sort((a, b) => a - b);
    
//     const restCount = tangerine.length - k;
//     let sum = 0;
//     let typeCount = Object.keys(counts).length;
//     for (const count of sortedCounts) {
//         if (sum + count > restCount) {
//             break;
//         }
//         sum += count;
//         typeCount--;
//     }
    
//     return typeCount;
// }