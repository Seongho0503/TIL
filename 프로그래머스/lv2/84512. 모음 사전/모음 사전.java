class Solution {
    int result = 0;
    boolean isEqual = false;

    public int solution(String word) {
        int answer = 0;

        recursive(word, new StringBuilder(), new String[]{"A", "E", "I", "O", "U"});
        answer = result;
        return answer;
    }

    // String은 메모리 낭비 되기 때문에 StringBuilder 사용
    public void recursive(String word, StringBuilder sb, String[] sArray){
        
        //목표 target 하고 동일하면 종료 equals 써야 함 
        if(word.equals(sb.toString())){
            isEqual = true;
            return;
        }
        // 백트래킹 : 글자수 넘어 가면 종료
        if(sb.length() == 5) return;

        for(int i = 0; i < sArray.length; i++){
            sb.append(sArray[i]);
            result += 1;
            recursive(word, sb, sArray);
            //isEqual이 true인 경우, 이미 타겟 문자열을 찾았으므로 재귀 호출을 종료합니다.
            if(isEqual) return;
            //sb에서 마지막 문자를 제거하여 이전 상태
            // StringBuilder delete() 메서드는 특정 범위의 문자를 제거합니다.
            sb.delete(sb.length()-1, sb.length());
        }

    }
}