import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
       Queue<Integer> pq = new PriorityQueue<>();
        
        for (int num : scoville) {
        pq.offer(num);
        }
        // 가작 작은 맛이 k보다 낮을 경우 => 음식 섞기
        while(pq.peek() < K){
            
            // 모든 음식을 다 합쳤을 때(하나 남았을 때) 
            // 더 섞을 음식이 없으니 -1 반환
            if(pq.size() == 1){
                return -1;
            }
            
            int food1 = pq.poll();
            int food2 = pq.poll();
            
            int result = food1 + (food2 * 2);
            
            pq.add(result);     
            answer++;
            
        }
        return answer;
    }
}