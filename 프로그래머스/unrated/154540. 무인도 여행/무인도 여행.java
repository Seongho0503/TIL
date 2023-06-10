import java.util.*;

class Solution {
    static int[] dy = {1, -1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static char[][] map; // X랑 숫자가 섞어있음
    static int sum;
    static int M, N;
    public LinkedList<Integer> solution(String[] maps) {
        LinkedList<Integer> answer = new LinkedList(); // [] 안써도 됬나?
        M = maps.length;
        N = maps[0].length(); // 입력 배열 안에는 문자열 length()
        map = new char[M][N];
        
        for(int i = 0; i < M; i++){
            String s = maps[i];
            for(int j = 0; j < N; j++){
                map[i][j] = s.charAt(j); // int[][] 와 s.charAt(j) 문자 자동 형변환   
            }
        }
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] != 'X'){
                    sum = (map[i][j] - '0'); // 문자를 int형으로 형변환
                     map[i][j] = 'X'; 
                    bfs(i,j);
                    answer.add(sum);
                }
            }
        }
        
        Collections.sort(answer); // LinkedList여서 Collections
        return answer.size() > 0 ? answer : new LinkedList<>(Arrays.asList(-1));
    }
    
    public void bfs(int cx, int cy){
        
        Queue<Integer> que = new LinkedList();
        que.add(cx);
        que.add(cy);
        
      while(que.size() > 0){
          int x = que.poll();
          int y = que.poll();
           //map[x][y] = 'X';  [1,1,28] 여기서 방문체크하면 에러
          
        for(int i = 0; i < 4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];
            
            if(ny < 0 || nx < 0 || nx >= M || ny >= N) continue;
            if(map[nx][ny] == 'X') continue;
            else {
                que.add(nx);
                que.add(ny);
                sum += (map[nx][ny] - '0'); // 문자를 int형으로 형변환
                map[nx][ny] = 'X';
            }           
        }
    }
    
  }
}


