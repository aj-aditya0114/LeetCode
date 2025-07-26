class Solution {
    public String shortestCommonSupersequence(String a, String b) {
        int m = a.length();
        int n = b.length();

        int[][]dp = new int[m+1][n+1];
         for(int j = 0; j < n +1; j++)dp[0][j] = 0;
        for(int i = 0; i < m + 1; i++)dp[i][0] = 0;
        for(int i = 1; i < m + 1; i++){
            for(int j = 1; j < n +1; j++){
                if(a.charAt(i - 1) == b.charAt(j - 1))dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Math.max(dp[i -1][j], dp[i][j - 1]);
            }
        }
        StringBuilder scs = new StringBuilder();
        int i = m, j = n;
        while(i > 0 && j > 0){
            if(a.charAt(i - 1) == b.charAt(j - 1)){
                scs.append(a.charAt(i - 1));
                i--;
                j--;
            }else if(dp[i][j - 1] > dp[i - 1][j]){
                scs.append(b.charAt(j - 1));
                j--;
            }else{
                scs.append(a.charAt(i - 1));
                i--;
            }
        }

        while(i > 0){
            scs.append(a.charAt(i - 1));
            i--;
        }

        while(j > 0){
            scs.append(b.charAt(j - 1));
            j--;
        }

        return scs.reverse().toString();
    }


    
}