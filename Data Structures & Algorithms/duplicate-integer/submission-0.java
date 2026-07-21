class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }

        final Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            else {
                map.put(nums[i], 1);
            }
        }

        return false;
    }
}