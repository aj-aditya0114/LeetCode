class Solution {
    public int[] asteroidCollision(int[] asteroid) {
        int n = asteroid.length;
        Stack<Integer> st = new Stack<>();
       

        for(int i = 0; i < n; i++){
            int curr = asteroid[i];
             boolean des = false;  

            while(!st.isEmpty() && curr < 0 && st.peek() > 0){
                if(st.peek() < -curr){
                    st.pop();
                }else if(st.peek() == -curr){
                    st.pop();
                    des = true;
                    break;
                }else{
                    des = true;
                    break;
                }
            }

            if(!des){
                st.push(curr);
            }
        }

        int[]res = new int[st.size()];
        for(int i = st.size() - 1; i >= 0; i--){
            res[i] = st.pop();
        }
        return res;
    }
}