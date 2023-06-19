import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] words = new String[N];
		for(int i = 0; i < N; i++) {
			words[i] = br.readLine();
		}
		
		Arrays.sort(words, (s1,s2) -> {	
			if(s1.length() == s2.length()) {
				return s1.compareTo(s2);
				//s1.compareTo(다른 스트링) 사전 순 정렬
			}
			else {
				return s1.length() - s2.length();
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		//중보된 단어 제외(맨 처음 미리 넣기)
		sb.append(words[0]).append('\n');
		
		for(int i = 1; i < N; i++) {
			if(!words[i].equals(words[i-1])) {
				sb.append(words[i]).append('\n');
			}
		}
		System.out.print(sb);
	}
}
