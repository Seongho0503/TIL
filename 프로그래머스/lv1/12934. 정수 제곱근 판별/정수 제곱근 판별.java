class Solution {
    public long solution(long n) {
        long answer = -1;
        long k = 1;
        while(k * k <= n){
            if(k * k == n){
                return (k+1) * (k+1);
            }
            k++;
        }
        return answer;
    }
}