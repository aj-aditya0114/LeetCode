class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n -1;
        int[]result = new int[n];
        int pos = n -1;
        while(left <= right){
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if(leftsq < rightsq){
                result[pos] = rightsq;
                right--;
            }else{
                result[pos] = leftsq;
                left++;
            }
            pos--;
        }
        return result;

    }
}