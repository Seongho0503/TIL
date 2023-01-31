function solution(id_list, report, k) {
    
    // 신고자 명단
    report_list = {};
    
    // id 가 key 값으로 key 값, value 값 설정
    id_list.map((id) => {
        return report_list[id] = [];
    })
    
    report.map((user) => {
        const[user_id,report_id] = user.split(" ");
        if(!report_list[report_id].includes(user_id)){
            report_list[report_id].push(user_id);
        }
    })
    
    const result = new Array(id_list.length);
    result.fill(0);
    
    
   for(const key in report_list){
       if(report_list[key].length >= k) {
           report_list[key].map((user) => {
               result[id_list.indexOf(user)] += 1;
           })
       }
       
   }
    
    return result;
}