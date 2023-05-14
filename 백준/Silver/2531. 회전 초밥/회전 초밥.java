import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 접수의 수 N
		int d = Integer.parseInt(st.nextToken()); // 초밥의 가짓수
		int k = Integer.parseInt(st.nextToken()); // 연속해서 먹는 접시의 수
		int c = Integer.parseInt(st.nextToken()); // 쿠폰 수
		
		int[] susies = new int[N];
		
		for(int i = 0; i < N; i++) {
			susies[i] = Integer.parseInt(br.readLine());
		}
		
		int si = 0;
		int ei = -1;
		int max = 0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		while(ei < susies.length + k -1 ) {
			ei++;
			if(ei < k) {
				map.put(susies[ei], map.getOrDefault(susies[ei],0) + 1);
			}else if(ei >= susies.length -1) {
				map.put(susies[ei%susies.length], map.getOrDefault(susies[ei%susies.length],0) + 1);
				map.put(susies[si%susies.length], map.getOrDefault(susies[si%susies.length],0) - 1);
				si++;
			}else{
				map.put(susies[ei], map.getOrDefault(susies[ei],0) + 1);
				map.put(susies[si], map.getOrDefault(susies[si],0) - 1);
				si++;
			}
			
			if(ei-si == k-1) {
				map.values().remove(0);
				//System.out.println(map.entrySet());
				int len = map.size();
				if(!map.containsKey(c)) len++; 
				//System.out.println(len);
				if(max < len) max = len;
			}
	
		}// while 종료
		
		System.out.print(max);
	}
}
