function solution(array) {
    var answer = [];
    var num = -1;
    array.map((i) => answer[i-1]+=1)
    array.map((j) =>{
        if(num === array[j]) return;
        num = Math.max(num, array[j]);
    })
    return num;
}