package LuoGu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "zhangsan");
        hashMap.put(2, "lisi");
        asdsa
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(2);
        treeSet.forEach(x -> System.out.println(x));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        int[] b = new int[5];
        String[] s = bufferedReader.readLine().split(":");
        // for (int i = 0; i < s.length; i++) {
        // a[i] = Integer.parseInt(s[i]);
        // }
        // String[] t = bufferedReader.readLine().split(":");
        // for (int i = 0; i < t.length; i++) {
        // b[i] = Integer.parseInt(t[i]);
        // }
        // long k = Long.parseLong(bufferedReader.readLine());
        // System.out.printf("%d", ((b[0] - a[0]) * 3600 + (b[1] - a[1]) * 60 + (b[2] -
        // a[2])) * k);

        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // int m = scanner.nextInt();
        // int ans = 0;
        // int[] mp = new int[n];
        // for (int i = 0; i < n; i++) {
        // mp[i] = scanner.nextInt();
        // }
        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        // sum += mp[i];
        // if (sum > m) {
        // sum = mp[i];
        // ans++;
        // }
        // }
        // System.out.println(ans);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[] gd = new int[n + 5];
        int[] xc = new int[n + 5];
        s = bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            gd[i + 1] = Integer.parseInt(s[i]);
        }

        for (int i = 0; i < m; i++) {
            s = bufferedReader.readLine().split(" ");
            int thistime = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            for (int j = 0; j < k; j++) {
                int x = Integer.parseInt(s[j + 2]);
                if (thistime >= xc[x] || gd[x] == -1) {
                    if (gd[x] == -1) {
                        continue;
                    }
                    xc[x] = thistime + gd[x];
                } else {
                    System.out.printf("Don't take %d at %d!\n", x, thistime);
                }
            }
        }
    }
}
