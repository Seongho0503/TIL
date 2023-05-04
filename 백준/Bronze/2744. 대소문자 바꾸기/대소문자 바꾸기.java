import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		for(int i = 0; i <str.length(); i++) {
			
			int ch = (int)str.charAt(i);
			
			//System.out.println(ch);
			
			if(ch >= 65 && ch <= 90 ) {
				sb.append((char)(ch + 32));
			}else {
				sb.append((char)(ch - 32));
			}
		}
		
		System.out.println(sb);
		
	}
}
