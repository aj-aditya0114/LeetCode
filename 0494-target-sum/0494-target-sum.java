class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int totalSum = 0;
        int zeroCount = 0;
        for(int i = 0; i < n; i++){
            totalSum += nums[i];
            if (nums[i] == 0) zeroCount++;
        }

       
        if (totalSum < Math.abs(target) || (target + totalSum) % 2 != 0) return 0;

        int val = (totalSum + target) / 2;
        int ways = subsetTargetSum(nums, val);

        
        return ways;
    }

    public int subsetTargetSum(int[] nums, int target) {
        int n = nums.length;
        int[] dp = new int[target + 1];
        dp[0] = 1;  // 1 way to make sum 0

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            for (int j = target; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }

        return dp[target];

    }
}