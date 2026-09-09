class Solution {
    public boolean isAnagram(String s, String t) {
        // If s and t have different lengths, they can't be anagrams.
        if(s.length() != t.length()) return false;

        /*
         * The idea is to create an array that keeps track of the number of occurences
         * of each character in s. Then as we traverse t, we decrement the corresponding
         * character count at each step. If we ever have a count that becomes negative, then
         * s and t are not anagrams.
         */
        int[] charCounts = new int[26];

        // Traverse s and count each character occurence.
        for(int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }

        // Traverse t and decrement each character occurence.
        for(int i = 0; i < t.length(); i++) {
            // If a character count is negative, s and t are not anagrams, so return false.
            if(--charCounts[t.charAt(i) - 'a'] < 0) return false;
        }

        // No character counts ended up negative. Since s and t are the same length,
        // they are anagrams, so return true.
        return true;
    }
}
