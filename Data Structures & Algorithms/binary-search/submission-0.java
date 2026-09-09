class Solution {
    public int search(int[] nums, int target) {
        return recursiveSearch(nums, target, 0, nums.length - 1);
    }
    
    public int recursiveSearch(int[] nums, int target, int left, int right) {
        if(left > right) return -1;

        int midIndex = (right + left + 1) / 2;
        int val = nums[midIndex];
        if(val == target) {
            return midIndex;
        }
        else if(val > target) {
            return recursiveSearch(nums, target, left, midIndex - 1);
        } else {
            return recursiveSearch(nums, target, midIndex + 1, right);
        }
    }
}
