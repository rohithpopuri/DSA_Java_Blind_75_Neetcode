class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>(); 
        // (1) using list will take more time because for lookup that is linear search 
        // which is o(n) insertion is o(1) and memory needs to be pre allocated
        // (2) using hashset because th look up time is o(1) and insertion time is o(1) no need of memory pre allocation
        for(int num : nums){
            if (seen.contains(num)){   // o(1)
                return true ;
            }
            seen.add(num); //o(1)
        }
        return false ;
    }
}