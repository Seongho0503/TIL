import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 땅 개수
		int Q = Integer.parseInt(st.nextToken()); // 오리 수
		
		// 오리가 땅 점유하고 있는지 여부 
		boolean[] used = new boolean[N+1];
		for(int i = 0; i < Q; i++) {
			int duck = Integer.parseInt(br.readLine().trim()); // 오리가 원하는 땅
			int first = 0; // 가질 수 없다면 처음 마주치는 점유된 땅의 번호
			int node = duck; // 현재 위치의 노드 번호
			while(node > 0) {
				if(used[node]) first = node; // 갈 수 없는 땅 갱신
				node /= 2; // 부모 노드 
			}
			if(first != 0)
				System.out.println(first);
			else {
				System.out.println(0); 
				used[duck] = true;   // 원하는 땅에 갈 수 있으면 방문처리 
			}
				
		}
	}
}
