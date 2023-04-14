function solution(skill, skill_trees) {
    let count = 0;
    let str = skill.split("");
    for(let i = 0; i < skill_trees.length; i++){
     let newArr = skill_trees[i].split("").filter(e => str.includes(e)).join("");
        if(newArr === skill.substring(0, newArr.length)) count++;
    }
    return count; 
}

// console.log(skill_trees[i].split(" "))
// [ 'BACDE' ]
// [ 'CBADF' ]
// [ 'AECB' ]
// [ 'BDA' ]

// console.log(skill_trees[i].split(""))
// [ 'B', 'A', 'C', 'D', 'E' ]
// [ 'C', 'B', 'A', 'D', 'F' ]
// [ 'A', 'E', 'C', 'B' ]
// [ 'B', 'D', 'A' ]