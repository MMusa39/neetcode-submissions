class Solution {
    public int maxSubArray(int[] nums) {
        // // Store the max sum of a subarray whose last element is at index i
        // int[] dp = new int[nums.length];
        // dp[0] = nums[0];
        // int result = dp[0];
        // for(int i = 1; i < nums.length; i++) {
        //     dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
        //     result = Math.max(result, dp[i]);
        // }
        // return result;
        int result = nums[0];
        int current = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(current < 0) {
                current = 0;
            }
            current += nums[i];
            result = Math.max(result, current);
        }
        return result;
    }
}
