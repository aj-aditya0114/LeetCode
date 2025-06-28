class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int lp = 0, rp = n - 1;
        int maxWater = 0;
        while(rp > lp){
            int wt = rp - lp;
            int height = Math.min(arr[rp], arr[lp]);
            int currentWater = wt * height;
            maxWater = Math.max(currentWater, maxWater);

            if(arr[lp] < arr[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
}