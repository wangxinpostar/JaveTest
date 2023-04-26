import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        // int maxx = 0;
        // int res = Integer.MAX_VALUE;
        // for (int i = 0; i < divisors.length; i++) {
        // int cnt = 0;
        // for (int j : nums) {
        // if (j % divisors[i] == 0) {
        // cnt++;
        // }
        // if (cnt == maxx && divisors[i] < res || cnt > maxx) {
        // maxx = cnt;
        // res = divisors[i];
        // }
        // }
        // }
        // return maxx == 0 ? Arrays.stream(divisors).min().getAsInt() : res;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxx = 0;
        int res = Integer.MAX_VALUE;
        for (int i : nums) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);
            } else {
                hashMap.put(i, 1);
            }
        }
        for (int i = 0; i < divisors.length; i++) {
            int cnt = 0;
            for (int j : hashMap.keySet()) {
                if (j % divisors[i] == 0) {
                    cnt += hashMap.get(j);
                }
            }
            if (cnt == maxx && divisors[i] < res || cnt > maxx) {
                maxx = cnt;
                res = divisors[i];
            }
        }
        return maxx == 0 ? Arrays.stream(divisors).min().getAsInt() : res;
    }
}