class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int count = 0;
       int left = nums[0];
       for(int i = 1; i + 1 < n; i++){
        if (nums[i] == nums[i + 1]) continue;
        if(left < nums[i] && nums[i] > nums[i + 1] ||
           left > nums[i] && nums[i + 1] > nums[i]){
            count++;
           }
           left = nums[i];
       }
       return count;
    }
}