import java.io.*;
import java.util.*;

class Solution {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static int[] visit;
    static int depth = 1; 
    public int solution(int n, int[][] edge) {
        
        visit = new int[n+1];
        int count = 0;
        
        for(int i = 0; i <= n; i++)
            list.add(new ArrayList<Integer>());
        
        for(int i = 0; i < edge.length; i++){
            int a = edge[i][0];
            int b = edge[i][1];
            
            list.get(a).add(b);
            list.get(b).add(a);
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
            
            ArrayList<Integer> node = list.get(nx);
           
            // 가장 깊은 depth 갱신
            if(depth < dep) depth = dep;
            
            for(int i = 0; i < node.size(); i++){
                int next = node.get(i);
                
                if(visit[next] == 0){     
                    visit[next] = dep + 1;
                    que.add(next);
                    que.add(dep+1);
                }
            }        
        }
        
    }
}