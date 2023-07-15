import java.util.*;

class Solution {
    static StringBuilder sb = new StringBuilder();
    static int[] rule = {1, 2, 4};

    public String solution(int n) {

        change(n);
        return sb.toString();
    }

    private static void change(int n) {
        if(n < 4) {
            sb.insert(0, rule[n - 1]);
            return; 
        }
    	sb.insert(0, rule[(n - 1) % 3]);
    	change((n - 1) / 3);
    }
}