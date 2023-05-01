import java.util.*;

class Solution {
    static ArrayList <Integer>[] graph;
    static int [] visited;
    static int depth; 
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        graph = new ArrayList[n+1];
        visited = new int[n+1];
        
        for(int i = 1; i <= n; i++) graph[i] = new ArrayList();
        for(int i = 0; i < edge.length; i++){
            graph[edge[i][0]].add(edge[i][1]);
            graph[edge[i][1]].add(edge[i][0]);
        }
        
        bfs(1,1);
        
        for(int i =1; i <= n; i++){
            if(depth == visited[i]) answer++;
        }
        
        
        return answer;
    }
    
    public void bfs(int start, int cnt){
        Queue <Integer> que = new LinkedList();
        que.add(start);
        que.add(cnt);
        visited[start] = cnt;
        
        while(que.size() > 0){
           int node = que.poll();
           int n = que.poll();
            
           if(depth < n) depth = n;
            for(int i = 0; i < graph[node].size(); i++){
              int next = graph[node].get(i);
              if(visited[next] != 0) continue;
              visited[next] = n+1;
              que.add(next);
              que.add(n+1);
            }
        }
    }
}