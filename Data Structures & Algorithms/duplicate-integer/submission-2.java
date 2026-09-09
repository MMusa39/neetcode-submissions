class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> prev = new HashSet<>();
        for(int num : nums) {
            if(prev.contains(num)) {
                return true;
            }
            prev.add(num);
        }
        return false;
    }
}
