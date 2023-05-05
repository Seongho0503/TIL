import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		int[] countA = new int[26];
		int[] countB = new int[26];
		
		for(int i = 0; i < a.length(); i++) {
			countA[a.charAt(i) - 'a']++;
		}
		
		for(int j = 0; j < b.length(); j++) {
			countB[b.charAt(j) - 'a']++;
		}
		
		int ans = 0;
		
		for(int i = 0; i < 26; i++) {
			
			if(countA[i] - countB[i] > 0) {
				ans += countA[i] - countB[i];
			}else if(countB[i] - countA[i] > 0) {
				ans += countB[i] - countA[i];
			}
			// 같으면 패스
		}
 		
		System.out.print(ans);
		
	}
}
