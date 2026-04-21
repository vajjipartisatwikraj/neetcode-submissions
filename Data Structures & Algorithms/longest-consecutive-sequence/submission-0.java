class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int val: nums){
            set.add(val);
        }

        int maxLen = 0;

        for(int value: set){
            int len = 0;
            while(set.contains(value)){
                len++;
                value++;
            }

            maxLen = Math.max(len, maxLen);
        }

        return maxLen;
    }
}
