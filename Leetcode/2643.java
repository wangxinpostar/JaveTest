class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res = new int[2];
        int r = 0;
        int maxx = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            int cnt = 0;
            for (int j : mat[i]) {
                if (j == 1) {
                    cnt++;
                }
            }
            if (maxx < cnt) {
                maxx = Math.max(maxx, cnt);
                r = i;
            }
        }
        res[0] = r;
        res[1] = maxx;
        return res;
    }
}