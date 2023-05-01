
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		//String[] arr = br.readLine().split(" ");
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		for(int tc = 0; tc < N; tc++) {
			String key = st.nextToken();
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			String num = st.nextToken();
			// 3 null null 1 2 null null 2 
			//if(num == null) num = "0"; //num이 int 여서 == null 못 쓴다
			sb.append(map.getOrDefault(num,0) + " ");
		}
		
		System.out.println(sb);
	}
}