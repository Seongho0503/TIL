import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine(); 
		// 대문자로 변환
		str = str.toUpperCase();
		
		// 알파벳 26개 : counting 배열
		int[] count = new int[26];
		
		int maxValue = 0;
		char maxChar = '?';
		for(int i = 0; i < str.length(); i++) {
			int idx = str.charAt(i) - 'A';
			if(maxValue < ++count[idx]) {
				maxValue = count[idx];
				maxChar = str.charAt(i);
			}else if (maxValue == count[idx]) {
				maxChar = '?';
			}
		}
		
		bw.write(maxChar);
		bw.close();
		br.close();
	}
}