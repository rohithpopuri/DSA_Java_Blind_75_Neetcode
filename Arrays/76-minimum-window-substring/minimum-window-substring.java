class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) return "";

        Map<Character,Integer> t_count = new HashMap<Character,Integer>();
        Map<Character, Integer> window = new HashMap<>();
        // count the frequency of the t string
        for(char s1 : t.toCharArray()){
            t_count.put(s1,t_count.getOrDefault(s1,0)+1);
        }
        //using vraibles have,need to check the all charcters are thre or not
        int have = 0, need = t_count.size();
        // res for legnth , res[o] for left(l),res[0] for right(r)
        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        //(left pointer for removing the elemnt from left to get minimum window)
        int l = 0;

        for(int  r=0 ; r<s.length();r++){
            char c = s.charAt(r);
            // get the frequency of each element
            window.put(c,window.getOrDefault(c,0)+1);


            // check the frequency matches in t if does increment the have 
            if (t_count.containsKey(c) && window.get(c).equals(t_count.get(c))){
                have++;
            }
            // check every time if have and need are equal and reduce the window size
            while(have==need){
                // reset the string  indexes
                if ((r - l + 1) < resLen) {
                    resLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }
                // decrease the left most element count  to reduce the window size
                window.put(s.charAt(l),window.get(s.charAt(l))-1);

                // if the removed element in t and count of element is s is less than t reduce the have else increase the left no matter
                if(t_count.containsKey(s.charAt(l)) && window.get(s.charAt(l))< t_count.get(s.charAt(l))){
                    have--;  
                }
                l++;
            }
        }
        //return the string
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);

        
    }
}