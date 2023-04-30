import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			String person = br.readLine();
			if(!hm.containsKey(person)) {
				hm.put(person, 1);
			}
		}
		
		for(int i = 0; i < m; i++) {
			String person = br.readLine();
			if(hm.containsKey(person)) {
				hm.put(person, hm.get(person)+1);
			}
		}
		
		ArrayList<String> list = new ArrayList<>(); 
		
		for(String key : hm.keySet()) {
			if(hm.get(key) == 2) {
				list.add(key);
			}
		}
		
		String[] arr = new String[list.size()];
		list.toArray(arr);
		Arrays.sort(arr);
		
		System.out.println(arr.length);
		
		for(String str : arr) {
			System.out.println(str);
		}
	}
}