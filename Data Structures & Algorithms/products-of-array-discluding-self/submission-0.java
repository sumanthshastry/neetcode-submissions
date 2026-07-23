class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int result = 1, zeroCount = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                result *= nums[i];
            }
            else {
                zeroCount++;
            }
        }

        if (zeroCount > 1) {
            return new int[nums.length];
        }

        System.out.println(result);
        int [] response = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
           if (zeroCount > 0) {
                response[i] = nums[i] == 0 ? result : 0;
            }
            else {
                response[i] = result/nums[i];
            }
        }

        return response;
    }
}  
