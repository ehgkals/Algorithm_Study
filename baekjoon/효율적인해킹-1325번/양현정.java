import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer>[] graph;
    static int cnt;
    static int MAX = Integer.MIN_VALUE;
    static boolean[] visited;

    public static void dfs(int node) {
        visited[node] = true;
        for (int a : graph[node]) {
            if (!visited[a]) {
                cnt++;
                dfs(a);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; ++i) graph[i] = new ArrayList<>();

        for (int i = 0; i < M; ++i) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph[B].add(A);
        }

        int result[] = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            visited = new boolean[N + 1];
            cnt = 0;
            dfs(i);
            result[i] = cnt;
            if (MAX < cnt) MAX = cnt;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; ++i) {
            if (result[i] == MAX) sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }

}