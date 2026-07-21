class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        if (nums == null || nums.length == 0) {
            return null;
        }
        else if (nums.length == 1 && nums[0] == target) {
            return new int[] {nums[0]};
        }
        else {
            map.put(nums[0], 0);

            for (int i=1; i<nums.length; i++) {
                Integer cur = map.get(target-nums[i]);
                if (cur != null && cur != i) {
                    return new int[] {cur, i};
                }
                else {
                    map.put(nums[i], i);
                }
            }
        }
        return null;
    }
}
