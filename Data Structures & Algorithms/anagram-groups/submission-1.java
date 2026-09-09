class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            String charCounts = getCharacterCountsString(s);
            if(groups.containsKey(charCounts)) {
                groups.get(charCounts).add(s);
            } else {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(s);
                groups.put(charCounts, newGroup);
            }
        }
        return new ArrayList<>(groups.values());
    }

    public String getCharacterCountsString(String s) {
        int[] result = new int[26];
        for(int i = 0; i < s.length(); i++) {
            result[s.charAt(i) - 'a']++;
        }
        return Arrays.toString(result);
    }

}
