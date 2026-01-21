class Solution {
    public int maximumCount(int[] arr) {
        int n = arr.length;
        int negIdx = 0, posIdx = 0, posCount = 0, negCount = 0;
        negIdx = findPositions(arr, 0);
        posIdx = findPositions(arr, 1);

        negCount = (negIdx == -1) ? n : negIdx;
        posCount = (posIdx == -1) ? 0 : n - posIdx;

        int count = Math.max(negCount, posCount);
        return count;
       
    }

    public static int findPositions(int[]arr, int target){
         int n = arr.length;
        int low = 0, high = n-1, idx = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] >= target){
                idx = mid; 
                high = mid - 1;
                
            }else{
                low = mid + 1;
            }
        }
        return idx;

    }
}