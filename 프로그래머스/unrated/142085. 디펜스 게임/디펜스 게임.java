import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int my = n;
        int card = k;
        
        for(int i = 0; i < enemy.length; i++){
            
            n -= enemy[i];
            pq.add(enemy[i]);
            
            if(n < 0){
                if(card > 0){
                    n += pq.poll();
                    card--;
                }else {
                    answer = i;
                    break;
                }
            }
            
        }
        
        
        return answer;
    }
}