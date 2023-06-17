import java.util.*;

class Solution {
    static String[] alp = {"A", "E", "I", "O", "U"};
    static String target;
    static int answer = 0;
    static boolean isEqual = false;
    public int solution(String word) {
        target = word;
        dfs(new StringBuilder());
        return answer;
    }
    
    public void dfs(StringBuilder sb){
        
        if(target.equals(sb.toString())){
            isEqual = true;
            return;
        }
        
        if(sb.length() == 5) return;
        
         for(int i = 0; i < alp.length; i++){
            sb.append(alp[i]);
            answer += 1;
            dfs(sb);
            if(isEqual) return;
            sb.delete(sb.length()-1, sb.length());
        }
    }
}