class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Create a hashset to track previously encountered values.
        Set<Integer> prev = new HashSet<>();

        /*
         * For each num in nums, try to add to prev. If prev already contained num,
         * then nums has a duplicate, so return true.
         */
        for(int num : nums) {
            if(!prev.add(num)) {
                return true;
            }
        }
        return false;
    }
}
