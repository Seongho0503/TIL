import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap<Character, Integer> map = new HashMap<>();
		String word = br.readLine();
		
		for(char i = 'a'; i <= 'z'; i++) {
			map.put(i, -1);
		}
		
		for(int i = 0; i < word.length(); i++) {
			if(map.get(word.charAt(i)) == -1) {
				map.put(word.charAt(i), i);
			}
		}
		
		for(int value : map.values()) {
			sb.append(value + " ");
		}
		
		System.out.println(sb);
	}
}


/*
1. 해쉬맵에 알파벳을 key로 값을 -1로 초기화
2. 단어의 각 알파벳 인덱스를 value 값으로 넣기
*/