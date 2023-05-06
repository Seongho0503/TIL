import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String word = br.readLine();
				
		// replace 방법
		// aaaaaaaa 8개
		// aaa 
		// replace 하고 aa가 남았으면
		// 3 * 2 = 6
		
		// str.replace(word, "X"); word를 X로 치환
		// 두 번째 인자 비워두면 삭제하여 반환!!
		String replaced = str.replace(word, "");
		int strLen = str.length() - replaced.length();
		int count = strLen / word.length();
		
		System.out.print(count);
	}
}