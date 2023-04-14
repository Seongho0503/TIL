function solution(skill, skill_trees) {
    // 문자열을 배열로
    let newArr = skill.split("");
    //console.log(newArr); 	[ 'C', 'B', 'D' ]
    let str = 0;
    let count = 0;
    for(let i = 0; i < skill_trees.length; i++){
        //newArr이 포함하는 문자인 것들만(true) 반환 => join("")을 이것을 다시 문자열로 반환
        str = skill_trees[i].split("").filter(e => newArr.includes(e)).join("");
        //console.log(str) 아래 주석 참고
        // 정답인 skill 만큼 길이를 자르고 비교 => 같으면 개수 증가
        if(str === skill.substring(0, str.length)){
            count++;
        }
    }
    return count; 
}

// newArr이 포함하는 문자인 것들만(true) 반환 => join("")을 이것을 다시 문자열로 반환
// str = skill_trees[i].split("").filter(e => newArr.includes(e))
// [ 'B', 'C', 'D' ]
// [ 'C', 'B', 'D' ]
// [ 'C', 'B' ]
// [ 'B', 'D' ]