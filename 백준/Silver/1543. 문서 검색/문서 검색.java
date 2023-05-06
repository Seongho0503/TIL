import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String ans = br.readLine();
		
		int len = ans.length();
		String check = "";
		int count = 0;
		
		//System.out.println(str.length()-len+1);
		for(int i = 0; i < str.length()-len+1; i++) {
			check = "";
 			for(int j = i; j < i + len; j++) {
 				if(j < str.length()) {
 					check += str.charAt(j);
 				}else break;
				
			}
 			//System.out.println(i + " " +check);
			if(check.equals(ans)) {
				count++;
				i = i+len-1; // 조건식에서 증감된다.
			}
		}
		
		System.out.print(count);
	}
}