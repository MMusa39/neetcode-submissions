class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] numOccurences = new int[26];
        for(int pos = 0; pos < s.length(); pos++) {
            numOccurences[s.charAt(pos) - 'a']++;
        }
        for(int pos = 0; pos < t.length(); pos++) {
            numOccurences[t.charAt(pos) - 'a']--;
            if( numOccurences[t.charAt(pos) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
