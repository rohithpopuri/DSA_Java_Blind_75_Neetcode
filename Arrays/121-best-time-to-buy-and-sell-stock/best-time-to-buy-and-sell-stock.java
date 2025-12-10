class Solution {
    public int maxProfit(int[] prices) {
        // int[] arr =prices ;
        // int min_price =Integer.MAX_VALUE ;
        // int min_index=0;
        int n=prices.length;
        // for(int i =0 ;i<n ;i++){
        //     if (arr[i]<min_price){
        //         min_price=arr[i];
        //         min_index=i;
        //     }
        // }
        // int max_profit = 0;

        // if (min_index==prices.length-1){
        //     return max_profit ;
        // }else{
        //     for(int j = min_index ; j<n ; j++){
        //         if (arr[j]-min_price > max_profit){
        //             max_profit=arr[j]-min_price;
        //         }
        //     }
        // }
        // return max_profit ;/

        int max_profit = 0 ;
        int min_price =prices[0];
        for (int i =0 ;i <n;i++){
            if (min_price > prices[i]  && i<n-1) {
                min_price=prices[i];
            }
            if (max_profit < prices[i]-min_price){
                max_profit= prices[i]-min_price;
            }
            
        }
        return max_profit ;
        
    }
}