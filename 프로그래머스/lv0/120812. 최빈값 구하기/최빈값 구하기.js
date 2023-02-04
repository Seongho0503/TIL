function solution(array) {
    var answer = new Array(1000).fill(null);
    var idx = -1;
    // var answer = new Array();
    var num = -1;
    // 누적 
    array.map((i) => answer[i]+=1);
    // max 값 구하기
    answer.map((j, id) =>{
        if(num < j) {
            num = j;
            idx = id;
        //num = Math.max(num, j);
    }})
    // max 중복 확인
    answer.map((k,id)=>{
        if(k===num && id!=idx) idx=-1;
    })
    return idx;
}