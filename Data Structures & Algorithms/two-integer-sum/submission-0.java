class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int x = nums[i];
            int compliment = target - x;

            if(map.containsKey(compliment) && map.get(compliment) != i){
                result[0] = i;
                result[1] = map.get(compliment);
                return result;
            }
        }

        return result;
    }
}
