class Solution {
    static int[][] dp = new int[100005][21];

    public long[] findPrefixScore(int[] nums) {
        long[] res = new long[nums.length];
        int n = nums.length;
        int maxx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxx = Math.max(maxx, nums[i]);
            res[i] = nums[i] + maxx;
        }
        for (int i = 1; i < n; i++)
            res[i] += res[i - 1];
        return res;
    }
}