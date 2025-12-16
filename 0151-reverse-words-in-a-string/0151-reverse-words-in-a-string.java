class Solution {
    public String reverseWords(String s) {
        String[]words = s.trim().split("\\s+");
        StringBuilder db = new StringBuilder();

        for(int i = words.length-1; i >= 0; i--){
            String str = words[i];
            db.append(str);
            if(i != 0){
                db.append(" ");
            }
        }
        return db.toString();
    }
}