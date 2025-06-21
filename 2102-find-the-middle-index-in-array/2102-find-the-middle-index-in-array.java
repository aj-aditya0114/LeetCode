class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        
        int total = 0;
        for(int i = 0; i < n; i++){
            total += nums[i];
        }
        int left_sum = 0;
        for(int i = 0; i < n; i++){
            int right_sum = total - left_sum - nums[i];
            if(right_sum == left_sum){
                return i;
            }
            left_sum += nums[i];
        }

        return -1;
        
    }
}