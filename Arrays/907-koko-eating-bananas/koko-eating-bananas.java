class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max_element =Arrays.stream(piles).max().getAsInt();
        int res=max_element;
        

        int min_element =1;
        while(min_element<=max_element){
           int mid= (min_element+max_element)/2;
           long total_hours=0;
            for(int p :piles){
                total_hours+=Math.ceil((double) p/mid);
            }
            if (total_hours<=h){
                res=mid;
                max_element =mid-1;
            }else{
                min_element=mid+1;
            }
        }
        
        return res ;
        
    }
}