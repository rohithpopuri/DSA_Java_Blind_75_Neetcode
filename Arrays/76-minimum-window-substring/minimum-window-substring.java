class Solution {
    public String minWindow(String s, String t) {

        Map<Character,Integer> t_count = new HashMap<Character,Integer>();
        Map<Character, Integer> window = new HashMap<>();

        for(char s1 : t.toCharArray()){
            t_count.put(s1,t_count.getOrDefault(s1,0)+1);
        }
        int have = 0, need = t_count.size();
        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        int l = 0;

        for(int  r=0 ; r<s.length();r++){
            char c = s.charAt(r);

            window.put(c,window.getOrDefault(c,0)+1);

            if (t_count.containsKey(c) && window.get(c).equals(t_count.get(c))){
                have++;
            }

            while(have==need){
                if ((r - l + 1) < resLen) {
                    resLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }
                window.put(s.charAt(l),window.get(s.charAt(l))-1);

                if(t_count.containsKey(s.charAt(l)) && window.get(s.charAt(l))< t_count.get(s.charAt(l))){
                    have--;  
                }
                l++;
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);

        
    }
}