class Solution {
    public int maximalRectangle(char[][] arr) {
        int m = arr.length;
       int n = arr[0].length;

    int[] height = new int[n];  // histogram

    int maxArea = 0;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (arr[i][j] == '1') {
                height[j] += 1;
            } else {
                height[j] = 0;
            }
        }

        int area = getmaxArea(height);
        maxArea = Math.max(maxArea, area);
    }
    return maxArea;
    }

    public int getmaxArea(int []arr){
        int n = arr.length;
        
        int[]nse = new int[n];
        int[]pse = new int[n];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();
            
            st.push(i);
        }
        
        st.clear();
        
        
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();
            
            st.push(i);
        }
        
        int maxArea = 0;
        for(int i = 0; i < n; i++){
            int area = arr[i] *(nse[i] - pse[i] -1);
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }
}