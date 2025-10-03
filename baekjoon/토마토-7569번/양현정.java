import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Dot {
    int H;
    int N;
    int M;

    public Dot(int h, int n, int m) {
        H = h;
        N = n;
        M = m;
    }
}
public class Main {
    static int[] dh = {-1, 1, 0, 0, 0, 0};
    static int[] dn = {0, 0, 0, 0, -1, 1};
    static int[] dm = {0, 0, 1, -1, 0, 0};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int arr[][][] = new int[H][N][M];
        Queue<Dot> Q = new LinkedList<>();
        boolean bRipe = true;

        // 입력값 3차원 배열에 넣기, 1은 Q에 add
        for (int h = 0; h < H; ++h) {
            for (int n = 0; n < N; ++n) {
                st = new StringTokenizer(br.readLine());
                for (int m = 0; m < M; ++m) {
                    int t = Integer.parseInt(st.nextToken());
                    arr[h][n][m] = t;
                    if (t == 1) {
                        Q.add(new Dot(h, n, m));
                    } else if (t == 0) bRipe = false;
                }
            }
        }

        if (!bRipe) {
            while (!Q.isEmpty()) {
                Dot cur = Q.poll();
                // 6방향으로 0 -> 날짜로 바꾸기
                for (int i = 0; i < 6; ++i) {
                    int h = cur.H + dh[i];
                    int n = cur.N + dn[i];
                    int m = cur.M + dm[i];

                    if (h < H && n < N && m < M && h >= 0 && n >= 0 && m >= 0 && arr[h][n][m] == 0) {
                        arr[h][n][m] = arr[cur.H][cur.N][cur.M] + 1;
                        Q.offer(new Dot(h, n, m));
                    }
                }

            }

            // 최종 체크
            int max = Integer.MIN_VALUE;
            int t = 0;
            for (int h = 0; h < H; ++h) {
                for (int n = 0; n < N; ++n) {
                    for (int m = 0; m < M; ++m) {
                        t = arr[h][n][m];
                        if (t == 0) {
                            System.out.print(-1);
                            return;
                        }
                        if (max < t) max = t;
                    }
                }
            }
            System.out.print(max - 1);
        } else {
            System.out.print(0);
        }
    }
}