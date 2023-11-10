import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int count = 0;
        
        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();
        
        long sum1 = 0;
        long sum2 = 0;
        for(int i = 0; i < queue1.length; i++){
            sum1 += queue1[i];
            que1.add(queue1[i]);
        }
        
         for(int i = 0; i < queue2.length; i++){
            sum2 += queue2[i];
            que2.add(queue2[i]);
        }
       
       // 백트래킹 : 만약 두 큐의 합이 홀수면 못 만든다.
       if((sum1 + sum2) % 2 !=0 ) return -1;
		
        while(true){
            
            if(sum1 > sum2){
                int num1 = que1.poll();
                que2.add(num1);
                sum1 -= num1;
                sum2 += num1;
            }else if(sum2 > sum1){
                int num2 = que2.poll();
                que1.add(num2);
                sum2 -= num2;
                sum1 += num2;
            }else break;
            
            count++;
            if((queue1.length + queue2.length) * 2 < count) return -1;
        }
        
        return count;
    }
}