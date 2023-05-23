class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        for (int i = 1; i < derived.length; i++) {
            derived[0] ^= derived[i];
        }
        if (derived[0] == 0)
            return true;
        return false;
    }
}