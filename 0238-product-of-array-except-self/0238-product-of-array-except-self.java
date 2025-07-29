class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int prodL = 1;
        int prodR = 1;
        int[]ans = new int[n];
        for(int i = n - 1; i >= 0; i--){
            ans[i] = prodR;
            prodR = prodR * arr[i];
        }
        for(int i = 0; i < n; i++){
            ans[i] = ans[i] * prodL;
            prodL = prodL * arr[i];
        }

        return ans;
    }
}