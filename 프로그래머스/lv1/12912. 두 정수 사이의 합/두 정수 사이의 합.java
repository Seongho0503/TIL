class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int[] arr = {0,0};
        if(a > b){
            arr[0] = a;
            arr[1] = b;
        }else {
            arr[0] = b;
            arr[1] = a;
        }
        for(int i = arr[1]; i <= arr[0]; i++){
            answer += i;
        }
        return answer;
    }
}