class Solution {
    public int minOperations(int[] nums) {
        int cnt = 0;
        for (int i : nums) {
            if (i == 1)
                cnt++;
        }
        if (cnt != 0) {
            return nums.length - cnt;
        } else {
            int minn = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                int temp = nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    temp = gcd(temp, nums[j]);
                    if (temp == 1)
                        minn = Math.min(minn, j - i);
                }
            }
            if (minn == Integer.MAX_VALUE) {
                return -1;
            } else {
                return minn + nums.length - 1;
            }
        }
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}