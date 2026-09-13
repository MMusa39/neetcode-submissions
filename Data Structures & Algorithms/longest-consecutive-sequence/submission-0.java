class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        for(int num : nums) {
            elements.add(num);
        }
        int result = 0;
        for(int num : elements) {
            if(!elements.contains(num - 1)) {
                int subResult = 1;
                while(elements.contains(num + subResult)) {
                    subResult++;
                }
                result = Math.max(result, subResult);
            }
        }
        return result;
    }
}
