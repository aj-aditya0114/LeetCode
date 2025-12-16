class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer>map = new HashMap<>();
        int count = 0;
        int k = (n/2) + 1;
        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer>entry : map.entrySet()){
            if(entry.getValue() >= k){
                return entry.getKey();
            }
        }
        return 0;
    }
}