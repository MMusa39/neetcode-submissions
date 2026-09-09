class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> startVals = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(startVals.contains(nums[i])) continue;
            startVals.add(nums[i]);
            List<List<Integer>> subResult = twoSum(nums, -1 * nums[i], i + 1);
            while(subResult.size() > 0) {
                List<Integer> elem = subResult.remove(0);
                elem.add(nums[i]);
                result.add(elem);
            }
        }
        return result;
    }

    List<List<Integer>> twoSum(int[] nums, int target, int start) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> prev = new HashSet<>();
        Set<Integer> inSoln = new HashSet<>();
        for(int i = start; i < nums.length; i++) {
            if(inSoln.contains(nums[i])) continue;
            int diff = target - nums[i];
            if(prev.contains(diff)) {
                List<Integer> subResult = new ArrayList<>();
                subResult.add(diff);
                subResult.add(nums[i]);
                result.add(subResult);
                inSoln.add(diff);
                inSoln.add(nums[i]);
            }
            prev.add(nums[i]);
        }
        return result;
    }
}
