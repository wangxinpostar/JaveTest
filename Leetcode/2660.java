class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int res = 0, a = 0, b = 0, p = 0, q = 0;
        for (int i = 0; i < player1.length; i++) {
            if (p != 0) {
                a += 2 * player1[i];
                p--;
            } else {
                a += player1[i];
            }
            if (player1[i] >= 10) {
                p = 2;
            }
        }
        for (int i = 0; i < player2.length; i++) {
            if (q != 0) {
                b += 2 * player2[i];
                q--;
            } else {
                b += player2[i];
            }
            if (player2[i] >= 10) {
                q = 2;
            }
        }
        if (a > b) {
            res = 1;
        }
        if (a < b) {
            res = 2;
        }
        return res;
    }
}