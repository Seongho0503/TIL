import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int MAX;
	static int [][] schedule; 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		N = Integer.parseInt(br.readLine());
		// 퇴사날까지 포함하기 위해 N+1 크기로 설정
		schedule = new int[N+1][2];
		// 입력, i의 0번째 인덱스 비움
		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			schedule[i][0] = Integer.parseInt(st.nextToken()); // days 걸리는 기간
			schedule[i][1] = Integer.parseInt(st.nextToken()); // cost 비용
		}	
		dp();
		System.out.println(MAX);
	}
	// sums : dp배열(최대 cost) , next : 해당 날짜
	private static void dp() {
		// 1일부터 시작해서 0번 인덱스 미사용, 퇴사날은 N+1 이므로 => 기존 N에 +2 
		int[] sums = new int[N+2];
		// 1부터 시작하니 N에 등호 넣어주기
		for (int i = 1; i <= N; i++) {
			int next = schedule[i][0] + i;
			
			// 다음 이동할 날짜가 퇴사 날보다 작으면 그 일 할게 
			if(next <=N+1) {
				sums[next] = Math.max(sums[next], sums[i] + schedule[i][1]);
			}
			// 오늘과 그 바로 다음 날의 cost 비교
			sums[i+1]= Math.max(sums[i], sums[i+1]);
		}
		
		MAX = sums[N+1];
	}
}
