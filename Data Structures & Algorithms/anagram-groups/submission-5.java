class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupsMap = new HashMap<>();
        for(String s : strs) {
            String sFreqStr = computeFreqString(s);
            if(groupsMap.containsKey(sFreqStr)) {
                groupsMap.get(sFreqStr).add(s);
            } else {
                List<String> group = new ArrayList<>();
                group.add(s);
                groupsMap.put(sFreqStr, group);
            }
        }
        return new ArrayList<>(groupsMap.values());
    }

    String computeFreqString(String s) {
        int[] freqArr = new int[26];
        for(char c : s.toCharArray()) {
            freqArr[c - 'a']++;
        }
        return Arrays.toString(freqArr);
    }
}
