
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        for (int value : set) {

            if (!set.contains(value - 1)) {

                int current = value;
                int len = 1;

                while (set.contains(current + 1)) {
                    current++;
                    len++;
                }

                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}