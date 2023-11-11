import java.util.*;

class Solution {
    public int solution(int alp, int cop, int[][] problems) {
        int answer = 0;
        int maxAlp = 0;
        int maxCop = 0;
        for(int i = 0; i < problems.length; i++){
            maxAlp = Math.max(maxAlp, problems[i][0]);
            maxCop = Math.max(maxCop, problems[i][1]);
        }
        if(alp >= maxAlp && cop >= maxCop) return 0;
        
        if(alp > maxAlp) maxAlp = alp;
        if(cop > maxCop) maxCop = cop;
        
        
        int[][] dp = new int[maxAlp][maxCop];
        
        
        for(int i = alp; i < maxAlp; i++){
            for(int j = cop; j < maxCop; j++){
                
                
                
                
            }
        }
        
        
        return answer;
    }
}


