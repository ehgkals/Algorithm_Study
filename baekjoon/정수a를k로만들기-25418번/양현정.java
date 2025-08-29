import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        Queue<Integer> Q = new LinkedList<>();
        int[] visited = new int[K + 1];
        Q.add(A);

        int i = 0;
        while (!Q.isEmpty()) {
            ++i;
            int len = Q.size();
            for (int j = 0; j < len; ++j) {
                int d = Q.poll();
                int pl = d + 1;
                int pro = d * 2;

                if (pl == K || pro == K) {
                    System.out.println(i);
                    return;
                }
                if (pl <= K && visited[pl] == 0) {
                    Q.add(pl);
                    visited[pl] = 1;
                }
                if (pro <= K && visited[pro] == 0) {
                    Q.add(pro);
                    visited[pro] = 1;
                }
            }

        }
    }
}