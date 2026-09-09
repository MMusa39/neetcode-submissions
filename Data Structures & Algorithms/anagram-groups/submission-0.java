class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<int[]> helper = new ArrayList<>();
        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            int[] charCounts = getCharacterCounts(s);
            boolean grouped = false;
            for(int j = 0; j < helper.size() && !grouped; j++) {
                if(characterCountsAreEqual(helper.get(j), charCounts)) {
                    grouped = true;
                    result.get(j).add(s);
                    break;
                }
            }
            if(!grouped) {
                helper.add(charCounts);
                List<String> newGroup = new ArrayList<>();
                newGroup.add(s);
                result.add(newGroup);
            }
        }
        return result;
    }

    public int[] getCharacterCounts(String s) {
        int[] result = new int[26];
        for(int i = 0; i < s.length(); i++) {
            result[s.charAt(i) - 'a']++;
        }
        return result;
    }

    public boolean characterCountsAreEqual(int[] sCounts, int[] tCounts) {
        for(int i = 0; i < 26; i++) {
            if (sCounts[i] != tCounts[i]) return false;
        }
        return true;
    }
}
