class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i * 3 <= n; i++) {
            sum += 3 * i;
            if (i * 5 <= n && i * 5 % 3 != 0)
                sum += 5 * i;
            if (i * 7 <= n && i * 7 % 5 != 0 && i * 7 % 3 != 0)
                sum += 7 * i;
        }
        return sum;
    }
}