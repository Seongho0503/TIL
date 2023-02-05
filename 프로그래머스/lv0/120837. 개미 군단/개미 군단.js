function solution(hp) {
    let count = 0;
    let next = hp;
    var ant = [5,3,1]
    ant.map((key)=>{
    count += parseInt(next/key);
    next = next % key;
    })
    return count;
}