class Solution {
    public int[] frequencySort(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
                            if(a[0] == b[0]){
                                return b[1] - a[1];
                            }else{
                                return a[0]-b[0];
                            }
        });

        for(Map.Entry<Integer, Integer>entry : map.entrySet()){
            minHeap.add(new int[]{entry.getValue(), entry.getKey()});
        }

        List<Integer>ans = new ArrayList<>();
        while(!minHeap.isEmpty()){
            int[]pair = minHeap.poll();
            int freq = pair[0], val = pair[1];
            for(int i = 0; i < freq; i++){
                ans.add(val);
            }
        }

        int[]result = new int[arr.length];
       
        for(int i = 0; i < arr.length; i++){
            result[i] = ans.get(i);

        }
        return result;
    }
}