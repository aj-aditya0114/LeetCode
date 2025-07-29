class Solution {
    public int maxProduct(int[] arr) {
        int currMax = arr[0];
        int maxPr = arr[0];
        int currMin = arr[0];
        for(int i = 1; i < arr.length; i++){
            int temp = currMax;
            currMax = Math.max(arr[i], Math.max(currMax * arr[i], currMin * arr[i]));
            currMin = Math.min(arr[i], Math.min(temp * arr[i], currMin * arr[i]));
            maxPr = Math.max(maxPr,currMax);
        }
        return maxPr;
    }
}