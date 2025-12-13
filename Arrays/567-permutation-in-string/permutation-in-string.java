class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // char[] s1Arr = s1.toCharArray();
        // Arrays.sort(s1Arr);
        // String sortedS1 = new String(s1Arr);

        // for (int i = 0; i < s2.length(); i++) {
        //     for (int j = i; j < s2.length(); j++) {
        //         char[] subStrArr = s2.substring(i, j + 1).toCharArray();
        //         Arrays.sort(subStrArr);
        //         String sortedSubStr = new String(subStrArr);

        //         if (sortedSubStr.equals(sortedS1)) {
        //             return true;
        //         }
        //     }
        // }
        // return false;


         if (s1.length() > s2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Frequency of s1
        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        int windowSize = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            // Add current char to window
            freq2[s2.charAt(i) - 'a']++;

            // Remove char leaving the window
            if (i >= windowSize) {
                freq2[s2.charAt(i - windowSize) - 'a']--;
            }

            // Compare frequency arrays
            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
        
    }
}