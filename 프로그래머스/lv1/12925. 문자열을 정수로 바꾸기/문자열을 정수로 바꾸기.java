class Solution {
    public int solution(String s) {
        int answer = 0;
        int cal = 0;
        if(s.charAt(0) == '-') cal = 1;
        String str = s.substring(cal, s.length());
        answer = Integer.parseInt(str);
         if(s.charAt(0) == '-'){
            answer = -(answer);
        }
        return answer;
    }
}