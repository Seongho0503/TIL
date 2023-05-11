import java.util.*;
 
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int mod = 1000000007;
        
        int[][] board = new int[n + 1][m + 1];
        for(int i = 0; i < puddles.length; i++) {
            board[puddles[i][1]][puddles[i][0]] = -1; 
        }
        
        board[1][1] = 1;
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < m + 1; j++) {
                if(board[i][j] == -1) continue;
                if(board[i - 1][j] > 0) board[i][j] += board[i - 1][j] % mod;
                if(board[i][j - 1] > 0) board[i][j] += board[i][j - 1] % mod;
            }
        }
        return board[n][m] % mod;
    }
}


// import java.util.*;

// class Solution {
//     // 가로, 세로
//     static int[][] dirs = {{1,0}, {0,1}};
//     static int[][] dp;
//     public int[][] solution(int m, int n, int[][] puddles) {
//         int answer = 0;
//         dp = new int[n][m];
//         for(int i = 0; i < puddles.length; i++){
//             int px = puddles[i][0];
//             int py = puddles[i][1];
//             dp[py-1][px-1] = -1;
//         }
//         bfs(n, m);
//         return dp;
//         //return dp[n-1][m-1];
//     }
    
//     public void bfs(int sy, int sx){
        
//         Queue<Integer> que = new LinkedList<>();
//         //error: incompatible types: Object cannot be converted to int
//         // Queue<Integer> 안써서
 
//         que.add(0);
//         que.add(0);
//         dp[0][0] = 1;
//         // size() 게 쓰기
//         while(que.size() > 0) {
//             // pop() 이 아니라 poll()
           
//             int x = que.poll();
//             int y = que.poll();
//              //System.out.println(x);
            
//             for(int i = 0; i < dirs.length; i++){
//                 int nx = x + dirs[i][0];
//                 int ny = y + dirs[i][1];
//                 System.out.println(nx + " " + ny);
//                 // System.out.println(sx + " nm " + sy);
//                 if( nx >= sx || ny >= sy) continue;
//                 if(dp[ny][nx] == -1) continue;
//                 if(dp[ny][nx] == 0){
//                     que.add(nx);
//                     que.add(ny);
//                     dp[ny][nx] = dp[y][x] + 1;
//                 }
//             }
//         }// while 종료
//     } 
    
// }
// 오른쪽과 아래