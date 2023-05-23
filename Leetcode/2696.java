import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int minLength(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (deque.size() != 0) {
                if (deque.peek() == 'A' && s.charAt(i) == 'B' || deque.peek() == 'C' && s.charAt(i) == 'D') {
                    deque.removeFirst();
                } else {
                    deque.push(s.charAt(i));
                }
            } else {
                deque.push(s.charAt(i));
            }
        }
        return deque.size();
    }
}
