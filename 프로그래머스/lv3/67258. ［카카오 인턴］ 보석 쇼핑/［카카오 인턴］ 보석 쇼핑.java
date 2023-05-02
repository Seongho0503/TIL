import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
	        
            int answer[] = new int[2];
            // 큐랑 해쉬 맵은 같이 움직여야 한다.
	        Queue<String> q = new LinkedList<>(); // 보석을 넣을 가방
            HashMap<String, Integer> map = new HashMap<>(); // 보석과 해당 보석 개수 확인용
	        HashSet<String> set = new HashSet<>(); // 보석의 종류 확인용
            // 보석 종류 개수
	        set.addAll(Arrays.asList(gems));
            int len = set.size();
        
	        int start = 1;
            int end = 0; 
            int minsize = gems.length; // 최대 사이즈로 초기화 (max로 둬도 상관 없음)
	        
	        for(String gem: gems){
                // 보석을 하나씩 증가 시키면서 끝 인덱스 같이 증가 
	            map.put(gem, map.getOrDefault(gem, 0) + 1);
	            q.add(gem);
	            end++;
                //System.out.println(q.peek());
                // 방근 넣은 보석의 개수를 확인 했을 때 value 값이 1 이상이면 중복 보석 => 제외시킴
	            while(map.get(q.peek()) > 1){
	                map.put(q.peek(), map.get(q.peek()) - 1);
	                start++;
	                q.poll();
	            }
                // (사이즈 변경한 거와)보석 개수가 똑같고 최소 거리가 줄었을 때 최소 거리 갱신 
	            if(len == map.size() && minsize > end-start){
	                minsize = end - start;
	                answer[0] = start;
	                answer[1] = end;
	            }
	        }
	        return answer;
	    }
}
