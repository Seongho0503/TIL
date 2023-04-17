import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n); // Long -> String
        String[] arr = s.split("");  // String -> Array
        // int[] arr = s.toCharArray();
        
        // s 주의
        // 오름차순 : Arrays.sort(arr);
        // 내림차순 : Arrays.sort(arr, Collections.reverseOrder())
        Arrays.sort(arr, Collections.reverseOrder());
        // Array => String 배열 내 각 요소 뒤에 ""를 추가해 이어붙여 하나의 문자열로 생성
        s = String.join("", arr);
        // String => Long
        answer = Long.parseLong(s);
        
        return answer;
    }
}