import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Person[] p = new Person[N];
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			p[i] = new Person(Integer.parseInt(st.nextToken()),st.nextToken());
		}
		
		// 나이가 같으면 순서를 바꾸지 않음 = 처음 입력 순서
		Arrays.sort( p, (e1,e2) -> {
				return e1.age-e2.age;			
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(p[i].age).append(" ").append(p[i].name).append('\n');
		}
		System.out.println(sb);
	}
	
	public static class Person{
		int age;
		String name;
		
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
	}
}
