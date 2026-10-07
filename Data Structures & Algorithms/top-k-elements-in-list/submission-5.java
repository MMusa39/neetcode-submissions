class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = 
                            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer, Integer> p : freqMap.entrySet()) {
            if(pq.size() < k) {
                pq.add(p);
            } else if(pq.peek().getValue() < p.getValue()) {
                pq.poll();
                pq.add(p);
            }
        }
        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }
        return result;
    }
}
