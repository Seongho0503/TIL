import java.util.*;
import java.io.*;

public class Main {
	static HashMap<Character,Integer> target;
	static HashMap<Character, Integer> cur;
	static int count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[] str = br.readLine().toCharArray();
		
		target = new HashMap<>();
		cur = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		target.put('A', Integer.parseInt(st.nextToken()));
		target.put('C', Integer.parseInt(st.nextToken()));
		target.put('G', Integer.parseInt(st.nextToken()));
		target.put('T', Integer.parseInt(st.nextToken()));
		
		cur.put('A', 0);
		cur.put('C', 0);
		cur.put('G', 0);
		cur.put('T', 0);
		
		
		int si = 0;
		int ei = -1;
		while(ei < str.length -1) {
			if(++ei < M) {
				cur.put(str[ei], cur.get(str[ei]) + 1);
				//System.out.println(cur.entrySet());
			}else {
				cur.put(str[si], cur.get(str[si])-1);
				si++;
				cur.put(str[ei], cur.get(str[ei]) + 1);
				//System.out.println(cur.entrySet());
				
			}
			//System.out.println("ei " + ei);
			if(ei-si == M-1 ) check();
			
		}
		System.out.println(count);
	}
	 static void check() {
		int cnt = 0;
		
		for(char key : target.keySet()) {
			int ans_value = target.get(key);
			int cur_value = cur.get(key);
			if(ans_value <= cur_value) cnt++;
			//System.out.println(key +" " +ans_value +" < " + cur_value);
		}
		
		if(cnt == 4) count++;
	 }
}