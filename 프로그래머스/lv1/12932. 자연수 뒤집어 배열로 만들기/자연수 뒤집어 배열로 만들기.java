class Solution {
    public int[] solution(long n) {
        // 숫자 -> 문자열
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        // 뒤집어서 입력
        for(int i = str.length()-1; i>=0; i--){
            answer[str.length()-1-i] = str.charAt(i) - '0';
        }
        return answer;
    }
}