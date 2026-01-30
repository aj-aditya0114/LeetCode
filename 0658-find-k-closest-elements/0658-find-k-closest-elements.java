class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
         PriorityQueue<int[]> minheap = new PriorityQueue<>(
        (a, b) -> {
        if (a[1] != b[1]) return b[1] - a[1]; 
        return b[0] - a[0];             
    }
    );

    ArrayList<Integer> list = new ArrayList<>();

    for (int ele : arr) {
       int diff = Math.abs(ele - x);
       minheap.add(new int[]{ele, diff});

        while (minheap.size() > k) {
            minheap.poll(); 
        }
    }
    while (!minheap.isEmpty()) {
        list.add(minheap.poll()[0]);
    }
    Collections.sort(list);
    return list;
    }
}