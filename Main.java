import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, m;

    public static void main(String[] args) throws NumberFormatException, IOException {
        // n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue2.offer(2);
        priorityQueue2.offer(3);
        // HashMap<Integer, Integer> hashMap = new HashMap<>();
        // hashMap.put(1, 1);
        // hashMap.put(6, 1);
        // hashMap.put(4, 1);
        // hashMap.put(3, 1);
        // for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
        // System.out.println(entry.getKey() + " " + entry.getValue());
        // }
        // for (int k : hashMap.keySet()) {
        // System.out.println(k + " " + hashMap.get(k));
        // }
        System.out.println(priorityQueue2.peek());
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        List<int[]>[] list = new List[100010];

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 1; i <= m; i++) {
            s = br.readLine().split(" ");
            int u, v, w;
            u = Integer.parseInt(s[0]);
            v = Integer.parseInt(s[1]);
            w = Integer.parseInt(s[2]);
            list[u].add(new int[] { v, w });
            list[v].add(new int[] { u, w });
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(list[i], (o1, o2) -> {
                return o1[1] - o2[1];
            });
        }
    }
}
