

import java.io.*;
import java.util.*;

public class Main {
	static Stack <Integer> s;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String move = st.nextToken();
			int value = 0;
			// 올바르지 않는 표현 다음 토큰이 없을 때
			// if(!st.nextToken().equals(null)) {
			if(st.hasMoreTokens()) {
				value = Integer.parseInt(st.nextToken());
			}
			
			// sb.append(s.size() + '\n') 쓰지 말아라 , 값이 달라졌음
			switch(move) {
			case "push": s.push(value); break; 
			case "top": sb.append(peek()).append('\n'); break;
			case "size": sb.append(s.size()).append('\n'); break;
			case "pop": sb.append(pop()).append('\n'); break;
			case "empty": sb.append((s.empty()) ? 1: 0).append('\n'); break;
			}
		}
		System.out.print(sb);
		
	}

	// 구현
	//  스택에 top이 없으면 자동 예외 처리 java.util.EmptyStackException
	public static int pop() {
		// !s.peek().equals(null) 안좋음 size로 판별
		if(s.size() != 0) {
			return s.pop();
		}else {
			return -1;
		}	
	}
	
	// 구현
	//  스택에 top이 없으면 자동 예외 처리 java.util.EmptyStackException
	public static int peek() {	
		// !s.peek().equals(null) 안좋음 size로 판별
		if(s.size() != 0) {
			return s.peek();
		}else {
			return -1;
		}	
	}
}
