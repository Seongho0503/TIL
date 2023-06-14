import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        
        long left = 0;
        long right = times[times.length-1] * (long)n;
        
        while(left <= right){
            // mid : 최소 걸리는 심사 시간
            // sum : mid 시간 동안 처리 가능 사람 수
            long mid = (left + right) /2;
            long sum = 0;
            for(int i = 0; i < times.length; i++){
                sum += mid/times[i];
            }
            
            // n을 수용 불가 => n 증가하려면 left 이동
            if(sum < n){
                left = mid + 1;
            }else {
                answer = mid;
                right = mid -1;
            }
        }
        return answer;
    }
}