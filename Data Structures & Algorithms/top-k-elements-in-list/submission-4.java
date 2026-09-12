class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqs = new HashMap<>();
        for(int n : nums) {
            freqs.put(n, freqs.getOrDefault(n, 0) + 1);
        }
        // PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
        //     (a, b) -> a.getValue() - b.getValue());
        // for(Map.Entry<Integer, Integer> p : freqs.entrySet()) {
        //     pq.add(p);
        //     if(pq.size() > k) {
        //         pq.poll();
        //     }
        // }
        // int[] result = new int[k];
        // for(int i = 0; i < k; i++) {
        //     result[i] = pq.poll().getKey();
        // }
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry : freqs.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }
        int[] result = new int[k];
        int i = 0;
        int j = nums.length;
        while(i < k) {
            List<Integer> l = buckets[j];
            int t = 0;
            while(i < k && t < l.size()) {
                result[i] = l.get(t);
                i++;
                t++;
            }
            j--;
        }
        return result;
    }
}
