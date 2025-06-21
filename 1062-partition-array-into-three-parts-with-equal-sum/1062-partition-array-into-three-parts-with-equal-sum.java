class Solution {
    public boolean canThreePartsEqualSum(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int num : nums){
            total += num;
        }

        if(total % 3 != 0){
            return false;
        }

        int target = total / 3;
        int sum = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
            sum += nums[i];

            if(sum == target){
                count++;
                sum = 0;
            }
        }
        return count >= 3;

    }
}