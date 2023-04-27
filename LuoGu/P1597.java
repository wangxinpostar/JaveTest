package LuoGu;

import java.io.*;
import java.util.*;

public class P1597 {
    public static void main(String[] args) throws IOException {
        BufferedReader BufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = BufferedReader.readLine();
        char temp = ' ';
        int p = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('a', 0);
        hashMap.put('b', 0);
        hashMap.put('c', 0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'c') {
                if (p == 1) {
                    hashMap.put(temp, hashMap.get(s.charAt(i)));
                    p = 0;
                } else {
                    temp = s.charAt(i);
                    p = 1;
                }
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                p = 0;
                int num = 0;
                while (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num *= 10;
                    num += s.charAt(i) - '0';
                    i++;
                }
                i--;
                hashMap.put(temp, num);
            }
        }
        System.out.printf("%d %d %d", hashMap.get('a'), hashMap.get('b'), hashMap.get('c'));
    }
}
