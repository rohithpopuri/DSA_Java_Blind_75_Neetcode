class Solution {
    public boolean isAnagram(String s, String t) {
        //FIRST APPROACH
    //     Map<Character,Integer> counts= new HashMap<>();
    //     Map<Character,Integer> countt= new HashMap<>();

    //    if(s.length()==t.length()){
    //         for(int i=0 ;i<s.length();i++){
    //             counts.put(s.charAt(i),1+counts.getOrDefault(s.charAt(i),0));
    //             countt.put(t.charAt(i),1+countt.getOrDefault(t.charAt(i),0));
    //         }
    //         for (Character c : counts.keySet()){
    //             if (!counts.get(c).equals( countt.get(c))){
    //                 return false ;
    //             }
    //         }
    //    }
    //    else{
    //         return false;

    //    }
    //    return true ;

//OPTIMISED APPORACH

        if (s.length() != t.length()) return false;
        
        int[] count = new int[26];// assigned array
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            // subtratcing cuurent char with 'a' to get alphabetnumber in 1 to 26 and increase the number to +1
            count[t.charAt(i) - 'a']--;
            //decrease the number in the place to get back 0 if it exsits
            
        }
        //finally all element in array must be 0 else it is not a anagram
        for (int c : count) {
            if (c != 0) return false;
        }
        
        return true;
    }
}