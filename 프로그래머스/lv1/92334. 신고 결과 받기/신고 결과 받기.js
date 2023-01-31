
function solution(id_list, report, k) {
    
    const report_list = {}
    
    // 유저 id 별 신고 명단
    // 각 배열[신고 받은 유저] = [신고한 명단]  
    // report_list[muzi] = []
    // report_list[muszi] = [무지를 신고한 유저들]
    // report_list[key] = [values]
    id_list.map((user)=>{
    	return report_list[user]=[];
    })
    
    report.map((user)=>{
    	const [user_id,report_id] = user.split(" ");  // "muzi frodo" 신고한 유저 신고 받은 유저
		if(!report_list[report_id].includes(user_id)){ // 중복 제거 (한 사람이 똑같은 사람 중복 신고해도 1회로)
        	report_list[report_id].push(user_id); 
        }
    })
    
    const result = new Array(id_list.length); // 정답 배열
    result.fill(0) // result = [0,0,0,0] 초기화
     // const result = new Array(id_list.length).fill(0);
    
  // 각 배열[신고 받은 유저] = [신고한 명단] 
  // report_list[frodo] = ["muzi", "apeach"] 
  // report_list[key] = [values]
    for(const key in report_list){
        if(report_list[key].length >= k){ // 입력받은 신고가 k번 이상이면 
        	report_list[key].map((user)=>{
            	result[id_list.indexOf(user)]+=1 // id_list = ["muzi", "fodo", "apeach", "neo"]
            })
        }
    }
    
    return result;
}