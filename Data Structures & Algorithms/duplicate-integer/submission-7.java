class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> prev = new HashSet<>();
        for(int x : nums) {
            if(prev.contains(x)) {
                return true;
            }
            prev.add(x);
        }
        return false;
    }
}