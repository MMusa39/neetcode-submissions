class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> inSubstring = new HashSet<>();
        int start = 0;
        int end = 0;
        int result = 0;
        while(end < s.length()) {
            char current = s.charAt(end);
            if(!inSubstring.contains(current)) {
                inSubstring.add(current);
            } else {
                result = Math.max(result, end - start);
                while(start < end && s.charAt(start) != current) {
                    inSubstring.remove(s.charAt(start));
                    start++;
                }
                start++;
            }
            end++;
        }
        return Math.max(result, end - start);
    }
}
