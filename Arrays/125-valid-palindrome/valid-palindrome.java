class Solution {
    public boolean isPalindrome(String s) {
        // String d=s.replaceAll("[^a-zA-Z0-9]", "");
        // d=d.toLowerCase();
        // // StringBuilder str = new StringBuilder(d);
        // // String f=str.reverse().toString();
        // // if (d.equalsIgnoreCase(f)){
        // //     return true ;
        // // }
        // // return false;
        // int left =0;
        // int right = d.length()-1 ;

        // while (left<right){
        //     if (d.charAt(left)!=d.charAt(right)){
        //         System.out.println(d.charAt(left));
        //         return false;
        //     }
        //     left++;
        //     right--;



        // }
        // return true;
        
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !alphaNum(s.charAt(l))) {
                l++;
            }
            while (r > l && !alphaNum(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++; r--;
        }
        return true;



    }
    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}