import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        String[] arr = s.split("");
        // int[] arr = s.toCharArray();
        
        Arrays.sort(arr, Collections.reverseOrder());
        s = String.join("", arr);
        answer = Long.parseLong(s);
        
        return answer;
    }
}