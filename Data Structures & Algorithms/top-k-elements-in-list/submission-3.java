class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqs = new HashMap<>();
        for(int n : nums) {
            freqs.put(n, freqs.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer, Integer> p : freqs.entrySet()) {
            pq.add(p);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }
        return result;
    }
}
