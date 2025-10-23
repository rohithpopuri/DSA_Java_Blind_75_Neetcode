class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> counts= new HashMap<>();
        Map<Character,Integer> countt= new HashMap<>();

       if(s.length()==t.length()){
            for(int i=0 ;i<s.length();i++){
                counts.put(s.charAt(i),1+counts.getOrDefault(s.charAt(i),0));
                countt.put(t.charAt(i),1+countt.getOrDefault(t.charAt(i),0));
            }
            for (Character c : counts.keySet()){
                if (!counts.get(c).equals( countt.get(c))){
                    return false ;
                }
            }
       }
       else{
            return false;

       }
       return true ;
    }
}