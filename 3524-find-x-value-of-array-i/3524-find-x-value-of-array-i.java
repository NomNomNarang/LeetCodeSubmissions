class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] ans = new long[k];
        long[] prev = new long[k];

        for (int num : nums) {
            long[] curr = new long[k];

            // Subarray containing only nums[i]
            int rem = num % k;
            curr[rem]++;

            // Extend all previous subarrays
            for (int r = 0; r < k; r++) {
                if (prev[r] > 0) {
                    int newRem = (int) ((long) r * rem % k);
                    curr[newRem] += prev[r];
                }
            }

            // Add all subarrays ending here
            for (int r = 0; r < k; r++) {
                ans[r] += curr[r];
            }

            prev = curr;
        }

        return ans;
    }
}