class Solution {
    public boolean isPalindrome(String s) {
        String d=s.replaceAll("[^a-zA-Z0-9]", "");
        d=d.toLowerCase();
        // StringBuilder str = new StringBuilder(d);
        // String f=str.reverse().toString();
        // if (d.equalsIgnoreCase(f)){
        //     return true ;
        // }
        // return false;
        int left =0;
        int right = d.length()-1 ;

        while (left<right){
            if (d.charAt(left)!=d.charAt(right)){
                System.out.println(d.charAt(left));
                return false;
            }
            left++;
            right--;



        }
        return true;

    }
}