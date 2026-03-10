class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length, sum = 0, max = Integer.MIN_VALUE;

        for(int ele : weights){
            max = Math.max(max, ele);
            sum += ele;
        }
        int low = max, high = sum, ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(dayss(mid, weights) <= days){
                high = mid -1;
                ans = mid;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public int dayss(int capacity, int[]arr){
        int n = arr.length, c = capacity, day = 0;

        for(int i = 0; i < n; i++){
            if(c >= arr[i]){
                c -= arr[i];
            }else{
                day++;
                c = capacity - arr[i];
            }
        
        }
        day++;
        return day;

    }
}