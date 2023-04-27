package LuoGu;

import java.io.*;

public class P1615 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        int[] b = new int[5];
        String[] s = bufferedReader.readLine().split(":");
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        String[] t = bufferedReader.readLine().split(":");
        for (int i = 0; i < t.length; i++) {
            b[i] = Integer.parseInt(t[i]);
        }
        long k = Long.parseLong(bufferedReader.readLine());
        System.out.printf("%d", ((b[0] - a[0]) * 3600 + (b[1] - a[1]) * 60 + (b[2] - a[2])) * k);
    }
}
