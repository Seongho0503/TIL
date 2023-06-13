import java.util.*;

class Solution {
    static int[] arr;
    static int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        arr = numbers;
        dfs(0,0,target);
        return answer;
    }
    
    public void dfs(int sum, int index, int target){
        if(index == arr.length){
            if( sum == target){
                answer++;
               // return;
            }
            return;
        }
        int cur = arr[index];
        
        dfs(sum+cur, index+1, target);
        dfs(sum-cur, index+1, target);
    }
}