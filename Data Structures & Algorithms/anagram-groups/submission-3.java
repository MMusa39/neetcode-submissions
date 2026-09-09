class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();
        for(String s : strs) {
            String charCounts = getCharacterCountsString(s);
            if(!groups.containsKey(charCounts)) {
                groups.put(charCounts, new ArrayList<>());
            }
            groups.get(charCounts).add(s);
        }
        return new ArrayList<>(groups.values());
    }

    public String getCharacterCountsString(String s) {
        int[] result = new int[26];
        for(char c : s.toCharArray()) {
            result[c - 'a']++;
        }
        return Arrays.toString(result);
    }

}
