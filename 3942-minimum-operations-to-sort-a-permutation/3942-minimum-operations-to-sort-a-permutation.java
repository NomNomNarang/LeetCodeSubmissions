class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        int[] result = nums.clone();
        Arrays.sort(result);

        if (Arrays.equals(nums, result)) {
            return 0;
        }

        // Case 1: nums is a rotation of the sorted array
        int k = nums[0];
        boolean sortedRotation = true;

        for (int i = 0; i < n; i++) {
            if (nums[i] != (k + i) % n) {
                sortedRotation = false;
                break;
            }
        }

        if (sortedRotation) {
            return Math.min(n - k, k + 2);
        }

        // Case 2: nums is a rotation of the reversed sorted array
        k = (n - 1 - nums[0] + n) % n;
        boolean reversedRotation = true;

        for (int i = 0; i < n; i++) {
            int expected = n - 1 - ((k + i) % n);

            if (nums[i] != expected) {
                reversedRotation = false;
                break;
            }
        }

        if (reversedRotation) {
            return 1 + Math.min(k, n - k);
        }

        return -1;
    }
}