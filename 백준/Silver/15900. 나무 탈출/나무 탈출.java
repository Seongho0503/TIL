import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 그래프와 인접 리스트(adlist)
public class LinkedList_TEST {
	static LinkedList <Integer>[] list;
	static int answer;
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		// 인접 리스트 head 만들기, 0번 인덱스 헤드 비우고 루트 노드가 1번이기 때문에 N+1로 잡음
		list = new LinkedList[N+1];
		
		// N+1 자리에 결국 N번 노드가 들어가 (루트 노드가 1번부터 시작해 0번 인덱스 비워서 for문 1번 부터 )
		// 각 헤드마다인접 리스트 만들기
		for (int i = 1; i <= N; i++) {
			list[i] = new LinkedList<Integer>();
		}
		
		for (int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // 연결된 노드 a
			int b = Integer.parseInt(st.nextToken()); // 연결된 노드 b
			
			//1.  ArrayList와 다른 점은 가용량(크기)이 의미가 없기 때문에 가용량을 받는 생성자가 존재하지 않는다는 점입니다.
			// 헤드 인덱스로 트리 구현 
			list[a].add(b); 
			list[b].add(a);
		}
		
		dfs(1, 0 ,0); // 1번 노드부터 시작, 부모노드, 간선의 개수 총합
		// 1은 루트 노드여서 부모가 없으니 0을 넣었다.
		
		System.out.println((answer%2==0) ? "No" : "Yes"); // 간선의 총 합이 짝수면 짐, 홀수면 이김
		br.close();
	}
	private static void dfs(int cur, int p, int cnt) {  // 현재 노드, 부모 노드, 리프노드의 깊이
		
		for(int next : list[cur]) { // 헤드 노드의 요소들 
			if(next != p) { // 연결되 노드가 부모 노드가 아니라면
				dfs(next, cur, cnt+1);
			}
		}
		// 특정 노드가 루트 노드가 아니고, 노드의 인접리스트의 사이즈가 1이면
		// 그 노드는 리프 노드임.
		// 2. 인접 리스트는 실제로 연결된 노드들에 대한 정보만 저장하기 때문에, 그래프의 간선의 개수와 리스트 원소의 개수가 같다
		if(cur !=1 && list[cur].size()==1) { //리프 노드라면 깊이 추가
			answer+=cnt;
		}
	}

}
