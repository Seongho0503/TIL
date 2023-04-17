class Solution {
    public int solution(int n) {
        int answer = 0;
        int k = 1;
        while(k <= n){
            if(n % k == 0){
                int m = n / k;
                answer += (k+m);
            }
            k++;
        }
        return answer / 2;
    }
}