class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0)return 0;
        if(n == 1) return nums[0];
        int[]Dp = new int[n + 1];
        Dp[0] = 0;
        Dp[1] = nums[0];
        for(int i = 2; i < n + 1; i++){
            Dp[i] = Math.max(Dp[i - 1], Dp[i - 2] + nums[i - 1]);
        }
        return Dp[n];
    }
}