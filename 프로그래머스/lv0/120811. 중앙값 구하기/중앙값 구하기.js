function solution(array) {
    array.sort((a,b)=> {
       return a-b
    })
    var center = Math.floor(array.length/2)
    var answer = array[center];
    return answer;
}