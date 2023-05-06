import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String word = br.readLine();
		
		int count = 0;
		int startIndex = 0;
		
		while(true) {
			// 해당 문자열에서 word라는 문자열을 찾고 싶고, 처음부터가 아닌 startIndex부터 찾고 싶어
			int findIndex = str.indexOf(word, startIndex);
			
			// findIndex가 음수라면 찾지 못한거임
			if(findIndex < 0) break;
			// 찾으면 계속 진행
			count++;
			//start Index 갱신 (내가 찾은 첫 인덱스 + 길이만큼 뒤로 이동)
			startIndex = findIndex + word.length();
			
		}
		
		System.out.print(count);
	}
}