class Solution {
    public String solution(String phone_number) {
        String answer = "*";
        String num = phone_number.substring(0,phone_number.length()-4);
        answer =  answer.repeat(num.length()) + phone_number.substring(num.length());
        // phone_number.substring(num.length(),phone_number.length())
        // 시작부분만 쓰면 끝까지 출력되서 마지막 end-point 안 적어도 됨
        return answer;
    }
}