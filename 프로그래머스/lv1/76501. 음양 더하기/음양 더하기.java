class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < signs.length; i++){
            int num = absolutes[i];
            if(signs[i] == false){
                num = -num;
            }
             answer += num;
        }
        
        return answer;
    }
}