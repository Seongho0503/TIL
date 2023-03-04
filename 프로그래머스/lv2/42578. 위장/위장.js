function solution(clothes) {
            var answer = 1;
            let cH = new Map();
            
            for (let [key, val] of clothes) {
                if (cH.has(val)) cH.set(val, cH.get(val) + 1); // 이미 val을 가지고 있다면 +1을 해주고,
                else cH.set(val, 1); // 새로운 val이라면 1로 set 해준다.
            }
            //console.log(cH.values()) 	[Map Iterator] { 2, 1 }
            for(let val of cH.values()) { // 객체이니 of 써야 한다
                answer*=(val+1); //착용하지 않은 경우를 각 추가 
            }
            return answer-1; //최소 한가지 이상을 착용하기 때문에 모두 착용하지 않은 경우 제외
        }