class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[][]dp = new int[n + 1][amount + 1];

        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < amount + 1; j++){
                if(j == 0){
                    dp[i][j] = 0;
                }
                if(i == 0){
                    dp[i][j] = Integer.MAX_VALUE - 1;
                }
            }
        }

        
        

        for(int i = 1; i < n + 1; i++){
            for( int j = 1; j < amount + 1; j++){
                if(coins[i - 1] <= j){
                    int include = dp[i][j - coins[i - 1]];
                    if(include != Integer.MAX_VALUE - 1){
                        include += 1;
                    }
                    dp[i][j] = Math.min(include, dp[i - 1][j]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][amount] == Integer.MAX_VALUE - 1 ? -1 : dp[n][amount];
    }
}