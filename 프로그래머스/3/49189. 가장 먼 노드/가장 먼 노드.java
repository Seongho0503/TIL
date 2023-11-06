import java.io.*;
import java.util.*;

class Solution {
    static ArrayList <Integer>[] list;
    static int[] visit;
    static int depth = 1; 
    public int solution(int n, int[][] edge) {
        
        visit = new int[n+1];
        int count = 0;
        
        list = new ArrayList[n+1];
        
        for(int i = 0; i <= n; i++)
            list[i] = new ArrayList<>();
        
        for(int i = 0; i < edge.length; i++){
            int a = edge[i][0];
            int b = edge[i][1];
            
            list[a].add(b);
            list[b].add(a);
        }
        
        bfs(1, 1);
        
        for(int val : visit){
            if(depth == val) count++;
        }
        return count;
    }
    
    public static void bfs(int cur, int count){
        
        Queue <Integer> que = new LinkedList();
        
        que.add(cur);
        que.add(count);
        visit[cur] = count;
        
        while(que.size() > 0){
            
            int nx = que.poll();
            int dep = que.poll();
           
            // 가장 깊은 depth 갱신
            if(depth < dep) depth = dep;
            
            for(int next : list[nx]){
                
                if(visit[next] == 0){     
                    visit[next] = dep + 1;
                    que.add(next);
                    que.add(dep+1);
                }
            }        
        }
        
    }
}