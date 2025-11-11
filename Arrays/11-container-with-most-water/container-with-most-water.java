class Solution {
    public int maxArea(int[] height) {

        int left = 0 ,right=height.length-1;
        int max_area=0;

        while(left<right){
            int area =0 ;
            if(height[left]>height[right]){
                 area = (right-left)*height[right];
            }else{
                 area = (right-left)*height[left];
            }

            if (area > max_area){
                max_area=area;
                if(height[left]>height[right]){
                    right--;
                } else{
                    left++;
                }
            }
            else{
                if(height[left]>height[right]){
                    right--;
                } else{
                    left++;
                }
            }
        }
        return max_area ;
        
    }
}