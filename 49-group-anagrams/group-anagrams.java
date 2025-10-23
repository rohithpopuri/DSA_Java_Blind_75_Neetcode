class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ana = new HashMap<>();
        for (String s : strs){
            char[] t= s.toCharArray();//converting to char Array
            Arrays.sort(t);//sorting the array
            String s_sorted = new String(t);//reforming String with sorted array
            ana.putIfAbsent(s_sorted,new ArrayList<String>());//intialising map with key as sorted array and new list
            ana.get(s_sorted).add(s);//adding same sorted elements to list which value
        }
        return new ArrayList<>(ana.values());
        
    }
}