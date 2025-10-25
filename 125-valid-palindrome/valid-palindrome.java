class Solution {
    public boolean isPalindrome(String s) {
        String d=s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder str = new StringBuilder(d);
        String f=str.reverse().toString();
        if (d.equalsIgnoreCase(f)){
            return true ;
        }
        return false;
    }
}