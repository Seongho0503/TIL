import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		char[] ans = str.toCharArray();
		
		for(int i = 0; i <str.length(); i++) {
			
			int ch = str.charAt(i);
			
			// 대문자 -> 소문자 시작점 'a'에 + 거리
			if(ch >= 'A' && ch <= 'Z' ) {
				// 오답 : 'a' + 'Z' - ch
				ans[i] = (char)('a' + (ch - 'A'));
			}else {
				ans[i] = (char)('A' + (ch - 'a'));
			}
		}
		
		System.out.println(ans);
		
	}
}
