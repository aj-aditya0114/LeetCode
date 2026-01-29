class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxheap = new PriorityQueue<>(
            (a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1])
        );

        for(int i = 0; i < points.length; i++){
            maxheap.add(points[i]);

            if(maxheap.size() > k){
                maxheap.poll();
            }
        }

        int[][]arr = new int[k][2];
        int i = 0;
        while(!maxheap.isEmpty()){
            arr[i++] = maxheap.poll();
            
        }
        return arr;
    }
}