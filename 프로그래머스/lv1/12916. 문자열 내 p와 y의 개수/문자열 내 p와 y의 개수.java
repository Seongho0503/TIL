class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int[] count = {0,0}; 
        String str = s.toUpperCase();
        for(int i = 0; i < str.length(); i++){
            
            if(str.charAt(i) == 'P'){
                count[0]++;
            }else if(str.charAt(i) == 'Y'){
                count[1]++;
            }
            
            //count[str.charAt(i) == 'P' ? 0 : 1]++; P와 Y 만 있을 때 삼항연산자
            //str.charAt(i) == 'P' ? ++count[0] : ++count[1]; 이건 잘못된 코드
        }
        
        if(count[0] == count[1]) answer = true;
        else answer = false;
        
        return answer;
    }
}