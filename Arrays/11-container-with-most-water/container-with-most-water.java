class Solution {
    public int maxArea(int[] height) {

        int left = 0 ,right=height.length-1;
        int max_area=0;

        while(left<right){
            int area =(right-left)*Math.min(height[left],height[right]) ;
            // if(height[left]>height[right]){
            //      area =(right-left)*height[right]*height[right];
            // }else{
            //      area = (right-left)*height[left];
            // }

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