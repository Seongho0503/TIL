import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = N;
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			
			LinkedList <Character> list = new LinkedList<>();
			list.add(s.charAt(0));
			for(int j = 1; j < s.length(); j++) {
				char cur = s.charAt(j);
				if(cur != s.charAt(j-1)) {
					if(!list.contains(cur)) list.add(cur);
					else {
						count--;
						break;
					}
				}		
			}// 문자 체크
		}
		System.out.println(count);
	}
}
