// function solution(array, height) {
//     const persons = array.map((id) => id).filter((id)=>height<id);
//     return persons.length;
// }

function solution(array, height) {
    var answer = array.filter(item => item > height);
    return answer.length;
}