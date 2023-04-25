import java.util.PriorityQueue;

class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] arr = new int[101];
        int[] res = new int[n - k + 1];
        for (int i = 0; i < k; i++) {
            arr[nums[i] + 50]++;
        }
        res[0] = solve(arr, x);
        for (int i = k; i < n; i++) {
            arr[nums[i] + 50]++;
            arr[nums[i - k] + 50]--;
            res[i - k + 1] = solve(arr, x);
        }
        return res;
    }

    public int solve(int[] arrs, int x) {
        int cnt = 0;
        for (int i = 0; i < 50; i++) {
            cnt += arrs[i];
            if (cnt >= x)
                return i - 50;
        }
        return 0;
    }
}