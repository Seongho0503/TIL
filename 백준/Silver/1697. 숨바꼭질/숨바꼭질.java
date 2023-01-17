import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	static int N, K, min;
	static boolean[] road = new boolean[100001];
	static class Person{
		int cur; // 현재 위치
		int count; // 연산 횟수
		public Person(int cur, int count) {
			this.cur=cur;
			this.count=count;
		}
	}
	static ArrayDeque<Person> que = new ArrayDeque<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		if (N ==K) {
			System.out.println(0);
		}
		else {
			bfs(N, 0);
			System.out.println(min);
		}
	}
	private static void bfs(int start, int count) {
		Person person = new Person(start, count);
		que.add(person);
		while(!que.isEmpty()) { // 아무 것도 없을 때까지 동작
			person = que.poll(); // 큐에서 제일 먼저 넣을 것을 꺼냄
			int cur = person.cur;
			int cnt = person.count;
			
			//System.out.println("cur : " +person.cur + " min : " + person.count);
			if(person.cur == K) {
				min = person.count;
				return;
			}
			
			if( cur-1 >=0 && !road[cur-1] ){
                road[cur-1] = true;
                que.add(new Person(cur-1, cnt+1));
            }
            if(cur+1 < 100001 && !road[cur+1]  ){
                road[cur+1] = true;
                que.add(new Person(cur+1, cnt+1));
            }
            if(cur*2 < 100001 && !road[cur*2]){
                road[cur*2] = true;
                que.add(new Person(cur*2, cnt+1)); 
            }
			
//			if(!road[cur] && person.cur >= 0 && person.cur <=100000) {
//				road[cur] = true;
//				for (int i = 0; i < 3; i++) {
//					switch(i) {
//					case 0 : que.add(new Person(cur+1, cnt+1)); break;
//					case 1 : que.add(new Person(cur-1, cnt+1)); break;
//					case 2 : que.add(new Person(cur*2, cnt+1)); 
//					}
//				}
//				
//			}
			
			
		} // while 종료
	}
}