// import java.util.*;

class Solution {
    public int solution(int[] money) {
        // 2 가지 케이스
        int[][] dp = new int[2][money.length];
        
        // 첫번째 집을 터는 경우
        dp[0][0] = money[0]; 
        dp[0][1] = money[0];
        
        // 두번째 집부터 터는 경우 (첫 번째 집을 안 터는 경우)
        dp[1][0] = 0; 
        dp[1][1] = money[1];

        // 한 집을 떨어져서 털어야 하기 때문에 인덱스 간격을 2로 둠
        // money 인덱스 상 0(첫 번째 집)과 1(두 번째)집을 분기하기 위해 index 2번부터 시작
        for(int i = 2; i < money.length; i++) {
            dp[0][i] = Math.max(dp[0][i-1], dp[0][i-2] + money[i]);
            dp[1][i] = Math.max(dp[1][i-1], dp[1][i-2] + money[i]);
        }
        
        // 첫번째 집을 턴다면 원 상에서 첫번째 집하고 마지막 집이 붙어 있어 마지막 집 털 수 없음(length-2) <-마지막제외 
        return Math.max(dp[0][money.length-2], dp[1][money.length-1]);
    }
}