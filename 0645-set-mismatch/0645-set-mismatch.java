class Solution {
    public int[] findErrorNums(int[] arr) {
        int n = arr.length;
       // List<Integer>list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            while(arr[arr[i] - 1] != arr[i] && arr[i] > 0 && arr[i] <= n){
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        int duplicate = -1;
        int missing = -1;
        for(int i = 0; i < n; i++){
            if(arr[arr[i] - 1] != i + 1){
                duplicate = arr[i];
                missing = i + 1;
            }
        }
        
        return new int[]{duplicate, missing};
      }
}