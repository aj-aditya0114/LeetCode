class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a, b) -> (b-a));

        for(int ele : stones){
            maxheap.add(ele);
        }
    while(maxheap.size() > 1){
       int first =  maxheap.poll();
       int second = maxheap.poll();
       if(first != second){
         maxheap.add(first - second);
       }  
    }
       
       return maxheap.isEmpty() ? 0 : maxheap.poll();
    }
}