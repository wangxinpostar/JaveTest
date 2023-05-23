import java.util.ArrayList;

class Solution {
    public int[] circularGameLosers(int n, int k) {
        int[] re = new int[n + 1];
        re[1] = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1, j = 1;;) {
            if (re[(i + j * k - 1) % n + 1] >= 1) {
                break;
            } else {
                re[(i + j * k - 1) % n + 1] += 1;
            }
            i = (i + j * k - 1) % n + 1;
            j++;
        }
        for (int i = 1; i <= n; i++) {
            if (re[i] == 0) {
                ans.add(i);
            }
        }
        return ans.stream().mapToInt(x -> x).toArray();
    }
}