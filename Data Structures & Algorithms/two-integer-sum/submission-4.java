class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prev = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(prev.containsKey(diff)) {
                return new int[]{prev.get(diff), i};
            }
            prev.put(nums[i], i);
        }
        return null;
    }
}
