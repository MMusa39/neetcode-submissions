class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prev = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int match = prev.getOrDefault(target - nums[i], -1);
            if(match != -1) {
                return new int[] {match, i};
            } else {
                prev.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
