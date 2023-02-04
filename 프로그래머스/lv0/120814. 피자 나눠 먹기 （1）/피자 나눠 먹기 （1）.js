function solution(n) {
    // 피자수에 만약 나머지가 0 이상이면 피자개수+1
    var pizza = parseInt(n/7);
    if(n%7 >0) pizza+=1;
    return pizza;
}