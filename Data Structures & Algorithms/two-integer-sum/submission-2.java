class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
         * The idea is to create a hashmap where the keys are the previously
         * encountered values in nums, and the value is the corresponding index.
         * Then as we traverse nums, for each num, we check if target - num is
         * contained as a key in prev. If so, then we have discovered the pair of
         * elements summing to target, so we return the corresponding indicies.
         * Otherwise, we add the current value and its corresponding index to prev. 
         */
        HashMap<Integer, Integer> prev = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(prev.containsKey(diff)) {
                return new int[] {prev.get(diff), i};
            } else {
                prev.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
