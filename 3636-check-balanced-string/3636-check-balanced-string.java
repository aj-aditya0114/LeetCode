class Solution {
    public boolean isBalanced(String num) {
        int n = num.length();
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i < n; i++){
            int ch = num.charAt(i) - '0';
            if(i % 2 == 0)evenSum += ch;
            else oddSum += ch;
        }  
        return evenSum == oddSum;
    }
}