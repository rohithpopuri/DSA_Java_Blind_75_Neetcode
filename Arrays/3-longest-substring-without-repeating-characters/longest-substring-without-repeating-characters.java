class Solution {
    public int lengthOfLongestSubstring(String s) {

        int size= s.length();
        char[] arr = s.toCharArray();
        int max_length =0 ;
        for(int i =0 ; i< size;i++){
            String S= arr[i]+"" ;
            for(int j =i+1 ;j<size;j++){
                if (S.contains(arr[j]+"")){
                    break ;
                }
                S=S+arr[j];
            }
            System.out.println(S);
            if (S.length()>max_length){
                 max_length=S.length();
            }
            S="";
           
        }
        return max_length ;
    }
}