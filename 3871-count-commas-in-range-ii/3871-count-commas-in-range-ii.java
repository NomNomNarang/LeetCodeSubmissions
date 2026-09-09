class Solution {
    public long countCommas(long n) {
        long totalCommas = 0;
        // Commas appear at intervals of 1,000
        // 1st comma starts at 1,000
        // 2nd comma starts at 1,000,000 (10^6)
        // 3rd comma starts at 1,000,000,000 (10^9)
        for (long i = 1000; i <= n; i *= 1000) {
            totalCommas += (n - i + 1);
            // Prevent potential long overflow if i * 1000 exceeds Long.MAX_VALUE
            if (i>Long.MAX_VALUE / 1000) {
                break;
            }
        }
        return totalCommas;
    }
}