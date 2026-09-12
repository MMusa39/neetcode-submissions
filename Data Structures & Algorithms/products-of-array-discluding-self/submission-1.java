class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProd = new int[nums.length];
        leftProd[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            leftProd[i] = leftProd[i - 1] * nums[i - 1];
        }
        int[] result = new int[nums.length];
        int rightProd = 1;
        result[nums.length - 1] = leftProd[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--) {
            rightProd *= nums[i + 1];
            result[i] = leftProd[i] * rightProd;
        }
        return result;
    }
}  
