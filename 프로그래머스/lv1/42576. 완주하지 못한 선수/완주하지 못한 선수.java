import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i = 0;
        for(i = 0; i < completion.length; i++)
            if(!participant[i].equals(completion[i])) break;
        
        return participant[i];
    }
}

/*


참가자는 동명이인 일 수 있다 -> set 사용 불가 (중복 제거됨)
배열 -> set 바꾸는 방법
HashSet <String> pass = new HashSet<>(Arrays.asList(participant));

배열 -> 리스트 바꾸는 방법
LinkedList <String> pass = new LinkedList<>(participant); (X)
List <String> fail = Arrays.asList(completion); (O)

리스트에서 값 변경
fail.set(fail.indexOf(cur), ""); 

*/