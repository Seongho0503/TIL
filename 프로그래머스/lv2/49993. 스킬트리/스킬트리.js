function solution(skill, skill_trees) {
    var answer = 0;
    let sk = skill.split("");
    for(let i = 0; i < skill_trees.length; i++){
        let magic = skill_trees[i].split("").filter(e => sk.includes(e)).join("");
        if(magic === skill.substring(0, magic.length)){
            answer++;
        }
    }
    
    return answer;
}