import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine()); 
		
		while(T -- > 0) {
			HashMap<String, Integer> hm = new HashMap<>(); // <종류, 개수>
			
			int N = Integer.parseInt(br.readLine()); // 옷의 개수
			
			for(int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken(); // 옷 이름은 필요 없음
				String kind = st.nextToken(); // 옷 종류
				
				if(hm.containsKey(kind)) {
					hm.put(kind, hm.get(kind)+1);
				}else {
					hm.put(kind, 1);
				}
			}
			
			int result = 1;
			for(int val : hm.values()) {
				result *= (val+1);
			}
			
			System.out.println(result-1);	
			
		}
	}
}