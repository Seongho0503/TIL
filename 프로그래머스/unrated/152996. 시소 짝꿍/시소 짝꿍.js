function solution(weights) {
    var count = 0;
    for(let i = 0; i < weights.length-1; i++){
        const arr = makearr(weights[i]);
        for(let j = 0; j < weights.length; j++){
        if(i === j) break;
            for(let k = 0; k < 3 ; k++){
                let num = arr[k] / weights[j];
                 if( num === 1 || num === 2 || num === 3 || num === 4 ){
                    count++;
                    break;
                 }      
            }
        }
    }

    function makearr(num2){
        return [num2, num2 * 2, num2 * 3, num2 * 4]
    }    
    return count;
}