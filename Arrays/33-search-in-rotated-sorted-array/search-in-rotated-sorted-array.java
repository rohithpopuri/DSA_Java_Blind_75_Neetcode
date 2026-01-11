class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r = nums.length-1;

        while(l<r){
            int m  = (l+r)/2;
            if(nums[m]>nums[r]){
                l=m+1;
            }else{
                r=m;
            }
        }
        int povit =l;
        l = 0;
        r = nums.length - 1;
        if (target >= nums[povit] && target <= nums[r]){
            l=povit;
        }else{
            r=povit-1;
        }

        while(l<=r){
            int m = (l+r)/2;
            System.out.println(m);
            if (nums[m]>target){
              r=m-1;
                
            }else if(nums[m]==target){
                return m;
            }else{
                l=m+1;
               
            }
        }
        return -1;
        
    }
}