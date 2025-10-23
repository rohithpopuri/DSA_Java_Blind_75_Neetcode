class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> has = new HashMap<>();
        int i=0;
        for(int num : nums){
            if (has.containsKey(target-num)){
                return new int[] {has.get(target-num),i};
            }
            has.put(num,i);
            i++;
        }
        return null;
    }
}