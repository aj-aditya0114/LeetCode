class Solution {
    public int findDuplicate(int[] nums) {
       int n = nums.length;
       for(int i = 0; i < n; i++){
            while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]){
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
       }

       for(int i = 0; i < n; i++){
        if(nums[nums[i] - 1] != i + 1){
            return nums[i];
        }
       }
       return -1;
    }
}