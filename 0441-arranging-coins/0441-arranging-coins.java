class Solution {
    public int arrangeCoins(int n) {
        long x = (long)n;
        return (sqrt(8 * x + 1) - 1)/2;
    }

    public int sqrt(long x){
        if(x == 0)return 0;
        long low = 1, high = x, ans = 0;

        while(low <= high){
            long mid = low + (high - low) / 2;
            if (mid <= x / mid) {   
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int)ans;
    }
}