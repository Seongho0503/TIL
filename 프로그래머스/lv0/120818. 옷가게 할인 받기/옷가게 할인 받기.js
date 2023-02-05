// function solution(price) {
//     var answer = price;
//     if(price / 500000 >= 1) answer = parseInt ((price * 8)/10);
//     else if (price / 300000 >=1) answer = parseInt ((price * 9)/10);
//     else if (price / 100000 >= 1) answer = parseInt ((price * 95)/100);
//     return answer;
// }


function solution(price) {
    var answer = price;
    if(price / 500000 >= 1) answer = parseInt(price * 0.8);
    else if (price / 300000 >=1) answer = parseInt(price * 0.9);
    else if (price / 100000 >= 1) answer = parseInt(price * 0.95);
    return answer;
}