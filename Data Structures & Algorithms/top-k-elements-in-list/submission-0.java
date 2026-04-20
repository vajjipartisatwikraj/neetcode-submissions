class Solution {
     public static int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequencies
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort by frequency (descending) and take top k
        int[] result = map.entrySet()
                          .stream()
                          .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                          .limit(k)
                          .mapToInt(Map.Entry::getKey)
                          .toArray();

        return result;
    }
}
