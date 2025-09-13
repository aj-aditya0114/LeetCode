class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;
        int left = 0, maxLen = 0, count = 0;

        for(int right = 0; right < n; right++){
            if(arr[right] == 0){
                count++;
            }
            while(count > k){
                if(arr[left] == 0){
                    count--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}