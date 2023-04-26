import java.util.ArrayList;
import java.util.List;

class Solution {
    public int addMinimum(String word) {
        // int res = 0;
        // word = word.replaceAll("abc", "0").replaceAll("ab", "1").replaceAll("ac",
        // "1").replaceAll("bc", "1")
        // .replaceAll("a", "2")
        // .replaceAll("b", "2").replaceAll("c", "2");
        // for (int i = 0; i < word.length(); i++) {
        // res += word.charAt(i) - '0';
        // }
        List<List<Integer>> list = new ArrayList<>();
        for (List i : list) {
            for (int j = 1; j <= 9; j++) {
                i.add(j);
            }
        }
        for (List i : list) {
            System.out.println(i);
        }
        // return res;
    }
}