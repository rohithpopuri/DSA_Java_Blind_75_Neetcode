class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] produt = new int[nums.length];
        int n =nums.length;
        int[] prefix = new int[n];
        int[] sufix = new int[n];
        prefix[0]=1;
        sufix[n-1]=1;

        for(int i =1 ;i <n;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        for(int j =n-2 ;j>=0;j--){
            sufix[j]=sufix[j+1]*nums[j+1];
        }
        for(int k =0;k<n;k++){
            produt[k]=sufix[k]*prefix[k];
        }
        
        // for(int i =0 ;i<nums.length ;i++){
        //     int product =1;
        //     for(int j=0 ;j<nums.length ;j++){
        //         if (i==j){
        //             continue ;
        //         }
        //         product*=nums[j];
                
        //     }
        //     produt[i]=product;
        // }
        return produt ;
        
    }
}