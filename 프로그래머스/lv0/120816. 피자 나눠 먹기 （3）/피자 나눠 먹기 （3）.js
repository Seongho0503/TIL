function solution(slice, n) {
    var pizza = parseInt(n/slice);
    if(n%slice!=0) pizza+=1;
    return pizza;
}