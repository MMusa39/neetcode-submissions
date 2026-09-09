class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for(int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length];
        for(int i = 0; i < nums.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> pair : frequencies.entrySet()) {
            buckets[pair.getValue() - 1].add(pair.getKey());
        }

        int[] result = new int[k];
        int resultSize = 0;
        for(int i = nums.length - 1; i >= 0 && resultSize < k; i--) {
            List<Integer> bucket = buckets[i];
            while(bucket.size() > 0 && resultSize < k) {
                result[resultSize] = bucket.remove(0);
                resultSize++;
            }
        }
        return result;
    }
}
