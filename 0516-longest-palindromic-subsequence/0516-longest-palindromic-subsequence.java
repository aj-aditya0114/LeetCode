class Solution {
    public int longestPalindromeSubseq(String s) {
        String t = new StringBuilder(s).reverse().toString();
        int ans = lcs(s, t);
        return ans;
    }
    public int lcs(String a, String b){
        int m = a.length();
        int n = b.length();

        int [][]dp = new int[m + 1][n + 1];
        for(int j = 0; j < m + 1; j++) dp[0][j] = 0;
        for(int i = 0; i < n + 1; i++)dp[i][0] = 0;
        for(int i = 1; i < m + 1; i++){
            for(int j = 1; j < n + 1; j++){
                if(a.charAt(i - 1) == b.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Math.max(dp[i- 1][j], dp[i][j- 1]);
            }
        }

        return dp[m][n];
    }
}