class Solution {
    public boolean canPartition(int[] arr) {
        int n = arr.length;

        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
        }

        if(sum % 2 != 0){
            return false;
        }
        return subSetSum(arr, sum/2, n);
    }

    public boolean subSetSum(int[]arr, int target, int n){
        

        boolean[][]dp = new boolean[n + 1][target + 1];

        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < target + 1; j++){
                if(i == 0){
                    dp[i][j] = false;
                }
                if(j == 0){
                    dp[i][j] = true;
                }
            }
        }

        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < target + 1; j++){
                if(arr[i - 1] <= j){
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][target];
   }
}