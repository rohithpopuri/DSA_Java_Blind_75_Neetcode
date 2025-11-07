class Solution {
    public int longestConsecutive(int[] nums) { 
        Set<Integer> nums_set = new HashSet<>();
        int max_length =0;
        for(int i : nums){
            nums_set.add(i);
        } 
        for (int num : nums_set){
                int length=1;
                if (!nums_set.contains(num-1)){
                    
                    while(nums_set.contains(num+length)){
                            length++;
                    }
                    max_length=Math.max(max_length,length); 
                }
        }
        return max_length;
    }
}