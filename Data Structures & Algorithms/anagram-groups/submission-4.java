class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> prev = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            String seq = createFreqSequence(strs[i]);
            System.out.println(seq);
            if(prev.containsKey(seq)) {
                List<String> group = prev.get(seq);
                group.add(strs[i]);
            } else {
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                prev.put(seq, group);
            }
        }
        return new ArrayList<>(prev.values());
    }

    String createFreqSequence(String s) {
        int[] result = new int[26];
        for(int i = 0; i < s.length(); i++) {
            result[s.charAt(i) - 'a']++;
        }
        return Arrays.toString(result);
    }
}
