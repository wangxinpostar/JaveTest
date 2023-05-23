import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxx = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        if (s.equals("")) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            maxx = Math.max(maxx, i - left + 1);
        }
        return maxx;
    }
}