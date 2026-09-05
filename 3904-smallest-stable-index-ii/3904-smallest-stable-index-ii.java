class Solution {
    public int firstStableIndex(int[] nums, int k) {
        ArrayList<Integer> curr = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        // Store suffix minimums
        int[] suffixMin = new int[nums.length];
        suffixMin[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        for (int i = 0; i < nums.length; i++) {
            curr.add(nums[i]);
            // Update max of curr
            if (nums[i] > max) {
                max = nums[i];
            }
            int min = suffixMin[i];
            if (max - min <= k) {
                return i;
            }
        }
        return -1;
    }
}