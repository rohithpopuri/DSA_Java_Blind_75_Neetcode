class Solution {
    public int lengthOfLongestSubstring(String s) {
        // my solution -462
        // int size= s.length();
        // char[] arr = s.toCharArray();
        // int max_length =0 ;
        // for(int i =0 ; i< size;i++){
        //     String S= arr[i]+"" ;
        //     for(int j =i+1 ;j<size;j++){
        //         if (S.contains(arr[j]+"")){
        //             break ;
        //         }
        //         S=S+arr[j];
        //     }
        //     System.out.println(S);
        //     if (S.length()>max_length){
        //          max_length=S.length();
        //     }
        //     S="";
           
        // }
        // return max_length ;


        int left = 0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If duplicate found, shrink window
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }
    
        return maxLen;
    }
    
}