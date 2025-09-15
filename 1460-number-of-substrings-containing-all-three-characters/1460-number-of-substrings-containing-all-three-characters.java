class Solution {
    public int numberOfSubstrings(String s) {
        int n =s.length();
        int count = 0;
        int[]last = {-1, -1, -1};

        for(int i = 0; i < n; i++){
            last[s.charAt(i) - 'a'] = i;

            if(last[0] != -1 && last[1] != -1 && last[2] != -1){
                count += 1 + Math.min(last[0], Math.min(last[1], last[2]));
            }
        }
        return count;
    }
}