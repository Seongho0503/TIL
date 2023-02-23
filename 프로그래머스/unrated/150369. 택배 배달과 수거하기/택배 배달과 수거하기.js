function solution(cap, n, deliveries, pickups) {
    // 답안 변수
    let result = 0
    // 배달 거리, 회수 거리 카운트 변수
    const eachDist = [0, 0]
    // 배달 인덱스, 회수 인덱스
    // 항상 가장 맨 뒤에서 출발함 (n-1)
    let dIdx = n-1
    let pIdx = n-1
    // 배달, 회수가 종료된 인덱스 배열
    const de_end = []
    const pick_end = []
    // 배달할 곳이 남아있는 동안 반복
    while(dIdx > -1) {
        // 현재 배달해야하는 물품을 싣는다. (물품의 양 - 최대 적재 수) // 0보다 적다면 적재 가능, 0 이라면 즉시 귀환, 0보다 많다면 일부만 배달
        let diff = eachDist[0] + deliveries[dIdx] - cap
        // 모든 물품을 적재한 경우
        if(eachDist[0] === 0 && deliveries[dIdx] > 0) {
            de_end.push(dIdx)
        }
        // 이번 물품을 모두 적재할 수 있는 여유공간이 있다면
        if(diff <= 0) {
            eachDist[0] += deliveries[dIdx]
            deliveries[dIdx] = 0
        // 적재 가능한 양보다 많은 물품이 있다면
        } else if(diff > 0) {
            deliveries[dIdx] -= cap - eachDist[0]
            eachDist[0] = 0
            continue
        }
        dIdx--
    }
    // 회수할 곳이 남아있는 동안 반복    
    while(pIdx > -1) {
        let diff = eachDist[1] + pickups[pIdx] - cap
        if(eachDist[1] === 0 && pickups[pIdx] > 0) {
            pick_end.push(pIdx)   
        }
        if(diff <= 0) {
            eachDist[1] += pickups[pIdx]
            pickups[pIdx] = 0   
        }
        else if(diff > 0) {
            pickups[pIdx] -= cap - eachDist[1]
            eachDist[1] = 0
            continue
        }
        pIdx -= 1
    }
    // 배달 혹은 회수가 가능했다면
    if(de_end.length > 0 && pick_end.length > 0) {
        // 배달 수와 회수 수 중 최솟값을 입력
        let min_len = de_end.length >= pick_end.length ? pick_end.length : de_end.length
        // 최솟 값 만큼 반복
        // 왕복거리를 계산해야하므로 2 * (n+1)
        for(let i = 0 ; i < min_len ; i ++) {
            const d_last = de_end.shift()
            const p_last = pick_end.shift()
            result += 2 * (p_last > d_last ? p_last + 1 : d_last + 1)
        }
        while(de_end.length > 0) {
            result += 2 * (de_end.shift() + 1)
        }
        while(pick_end.length > 0) {
            result += 2 * (pick_end.shift() + 1)
        }
    }
//
    return result
}