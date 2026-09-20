class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int prevIndex = map.getOrDefault(c, -1);
            if(prevIndex >= start) {
                result = Math.max(result, i - start);
                start = prevIndex + 1;
            }
            map.put(c, i);
        }
        return Math.max(result, s.length() - start);
    }
}
