class Solution {
    static int[] discount = {10, 20, 30, 40};
    static int len;
    static int maxCost;
    static int maxSubscribe;
    static int[] discounts;
    public int[] solution(int[][] users, int[] emoticons) {

        len = emoticons.length;
        discounts = new int[len];
        
        dfs(0, users, emoticons);
        return new int[] {maxSubscribe, maxCost};
    }
    
    static void dfs(int depth, int[][] users, int[] emoticons){
        
        if(depth == len){
            int subscribe = 0;
            int cost = 0;
            
            for(int[] user : users){
                int userDiscountRate = user[0];
                int userMaxCost = user[1];
                
                int sum = 0;
                
                for(int i = 0; i < emoticons.length; i++){
                    if(discounts[i] >= userDiscountRate){
                        sum += emoticons[i] / 100 * (100 - discounts[i]); 
                    }
                }
                
                if(sum >= userMaxCost ) subscribe++;
                else cost += sum;
                       
            } // user
            
            if(subscribe > maxSubscribe ) {
                maxSubscribe = subscribe;
                maxCost = cost;
            } else if (subscribe == maxSubscribe && cost > maxCost){
                maxCost = cost;
            } 
            
            return;
        }
        
        for(int i = 0; i < 4; i++){
            discounts[depth] = discount[i]; 
            dfs(depth+1, users, emoticons);
        }
        
    }
}