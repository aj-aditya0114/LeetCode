class Solution {
    public int mySqrt(int x) {
        int left = 1, right = x, ans = -1;
        if(x == 0) return 0;
        if(x == 1) return 1;

        while(left <= right){
            int mid = left + (right-left) / 2;
            long sq = (long)mid * mid;
            if(sq == x){
                return mid;
            }else if(sq < x ){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}