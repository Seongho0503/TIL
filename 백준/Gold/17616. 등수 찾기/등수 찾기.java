//package BOJ_골3_17616_등수찾기;

import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		List<Integer>[] bToA = new List[N+1];
        List<Integer>[] aToB = new List[N+1];
        
        for (int i = 1; i <= N; i++) {
            bToA[i] = new ArrayList<>();
            aToB[i] = new ArrayList<>();
        }
        
        while (M-->0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bToA[b].add(a);
            aToB[a].add(b);
        }
		
        System.out.println(bfs(N, X, bToA) + " " + (N + 1 - bfs(N, X, aToB)));
	}
	
	static int bfs(int n, int x, List<Integer>[] edges) {
        boolean[] v = new boolean[n+1];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(x);
        v[x] = true;

        int cnt = 0;
        while (!q.isEmpty()) {
            int cur = q.poll();
            cnt++;

            for (int next : edges[cur]) {
                if (v[next]) continue;
                v[next] = true;
                q.add(next);
            }
        }
        return cnt;
    }
}
