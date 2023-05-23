class Solution {
    public int punishmentNumber(int n) {
        int rs = 0;
        for (int i = 0; i <= n; i++) {
            rs += dfs(String.valueOf(i * i), i, 0, 0) ? i * i : 0;
        }
        return rs;
    }

    private boolean dfs(String s, int targetSum, int index, int curSum) {
        if (index == s.length()) {
            return targetSum == curSum;
        }
        if (curSum > targetSum) {
            return false;
        }
        int tmpSum = 0;
        for (int i = index; i < s.length(); i++) {
            tmpSum = tmpSum * 10 + (s.charAt(i) - '0');
            if (dfs(s, targetSum, i + 1, curSum + tmpSum)) {
                return true;
            }
        }
        return false;
    }
}