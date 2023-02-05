function solution(n) {
    var sum =0;
    var str = n + "";
    var arr = str.split(""); 
    arr.map((key)=>{
        sum += parseInt(key);
    })
    return sum;
}