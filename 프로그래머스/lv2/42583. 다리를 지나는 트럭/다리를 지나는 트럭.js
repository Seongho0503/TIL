function solution(bridge_length, weight, truck_weights) {
    // 트럭이 다리를 건널 때 드는 시간
    let answer = 0;
    // 다리를 지나는 중인 트럭들의 무게를 저장
    let bridege = [];
     // 다리에 올라간 트럭이 몇 초 동안 올라가 있었는지 저장
    let time = [];

     // 다리를 건너는 과정. 다리 위와 다리 아래서 대기하는 트럭이 없을 때까지 반복.
    while (truck_weights.length || bridege.length) {
          // 다리에 가장 먼저 올라간 트럭이 다리를 다 건널만큼 다리 위에 있는 경우
        if (time[0] > bridge_length) {
            time.shift();
            bridege.shift();
        }
          // 다리 위에 있는 트럭들의 무게의 합을 저장
        let curWeight = bridege.reduce((prev, cur) => prev + cur, 0);
          // 이 무게의 합과 다리에 올라올 트럭 무게를 더한 값이 다리가 견딜 수 있는 무게보다 낮아야 함
        if (curWeight + truck_weights[0] <= weight && truck_weights.length) {
            bridege.push(truck_weights.shift());
            time.push(1);
        }
          // 모든 과정이 끝났으므로 시간 1초 증가
        answer++;
          // 다리 위에 있는 트럭들이 보낸 시간도 1초 증가
        time = time.map(element => element + 1);
    }
    return answer;
}






// function solution(bridge_length, weight, truck_weights) {
//     let time = 1;
//     let weight_sum = 0;
//     let idx = 0;
//     bridge = [];
//     while(truck_weights!==0){
//         let next_truck = truck_weights[idx]; 
//         // 도로위에 있는 현재 트럭 무게 총 합 + 다음 올라갈 틀럭이 다리 지탱 무게 보다 작다면 => 다음 트럭 올라갈 수 ok
//         if(weight_sum + next_truck <= weight){
//             // 다리 위에 트럭 올라갑니다
//             bridge.push(next_truck);
//             weight_sum += next_truck;
//             idx++;
//         }
//         // 시간 경과에 따른 트럭 이동
        
        
//         time++;
        
//     }
//     return time;
// }