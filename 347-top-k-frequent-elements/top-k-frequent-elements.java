class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Map<Integer,Integer> freq_map = new HashMap<>();
        // for (int num : nums){
        //     freq_map.put(num,1+freq_map.getOrDefault(num,0));

        // }
        // List<int[]>bucket = new ArrayList<>();
        // for(Map.Entry<Integer,Integer> entries : freq_map.entrySet()){
        //     bucket.add(new int[]{entries.getValue(),entries.getKey()});

        // } 
        // bucket.sort((a, b) -> b[0] - a[0]);
        // int[] ans = new int[k];
        // for(int i =0;i <k;i++){
        //     ans[i]=bucket.get(i)[1];
        // }
        // return ans;


        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
        
    }
}