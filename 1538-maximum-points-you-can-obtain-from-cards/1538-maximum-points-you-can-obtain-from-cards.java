class Solution {
    public int maxScore(int[] cards, int k) {
        int n = cards.length;
        int lsum = 0, rsum = 0, maxsum = 0;

        for(int i = 0; i < k; i++){
            lsum += cards[i];
            maxsum = lsum;
        }
        int rInd = n - 1;
        for(int i = k - 1; i>= 0; i--){
            lsum -= cards[i];
            rsum += cards[rInd];
            rInd = rInd - 1;

            maxsum = Math.max(maxsum, lsum+rsum);
        }
        return maxsum;
    }
}