class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq_map = new HashMap<>();
        for (int num : nums){
            freq_map.put(num,1+freq_map.getOrDefault(num,0));

        }
        List<int[]>bucket = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entries : freq_map.entrySet()){
            bucket.add(new int[]{entries.getValue(),entries.getKey()});

        } 
        bucket.sort((a, b) -> b[0] - a[0]);
        int[] ans = new int[k];
        for(int i =0;i <k;i++){
            ans[i]=bucket.get(i)[1];
        }
        return ans;
        
    }
}