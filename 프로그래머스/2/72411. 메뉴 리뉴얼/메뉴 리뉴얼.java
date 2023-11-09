import java.util.*;

class Solution {

    List<String> answerList = new ArrayList<>();  // 정답지
    Map<String, Integer> hashMap = new HashMap<>(); // 카운터

    public String[] solution(String[] orders, int[] course) {

        // 1. 각 Order 정렬 : XA 와 AX과 순서가 상관 없이 똑같은 메뉴
        for (int i = 0; i < orders.length; i++) {
            // String 배열을 정렬할 수 없어서 Character 배열로 바꾸고 정렬
            char[] arr = orders[i].toCharArray();
            Arrays.sort(arr);
            // 정렬된 문자 배열 arr을 다시 문자열로 변환하여 orders[i]에 대입합니다.
            orders[i] = String.valueOf(arr);
        }

        // 2. 각 order를 기준으로 courseLength 만큼의 조합 만들기
        for (int courseLength : course) {
            for (String order : orders)
                // 재귀함수로 구현
                dfs("", order, courseLength);

            // 3. 가장 많은 조합 answer에 저장
            // 해쉬맵이 엠티가 아니라면 = 콤비네이션으로 조합이 만들어졌다는 가정하에 
            // = 조합이 하나라도 만들어졌다면
            if (!hashMap.isEmpty()) {
                // 해쉬 값의 value 중 max값 찾아야함
                List<Integer> countList = new ArrayList<>(hashMap.values());
                // 리스트로 바꾼 이유는 max 값 찾기 편함
                int max = Collections.max(countList);

                // 조합이 2개 이상일때만 유효함 (max>1)
                if (max > 1)
                    for (String key : hashMap.keySet())
                        // 해당 키의 value가 max라면 값 넣기
                        if (hashMap.get(key) == max)
                            answerList.add(key);
                hashMap.clear();
            }
        }

        Collections.sort(answerList);
        String[] answer = new String[answerList.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = answerList.get(i);

        return answer;
    }
    
    // 재귀는 탈출조건과 수행동작
    // order: 현재까지 조합된 코스, others: 아직까지 사용되지 않은 알파벳, count : 몇개를 더 조합해야하는지
    public void dfs(String order, String others, int count) {
        // 탈출 조건 : count == 0
        if (count == 0) {
            hashMap.put(order, hashMap.getOrDefault(order, 0) + 1);
            return;
        }
        
        // 수행동작
        // 0부터 length까지 조합
        for (int i = 0; i < others.length(); i++)
            dfs(order + others.charAt(i), others.substring(i + 1), count - 1);
    }
}