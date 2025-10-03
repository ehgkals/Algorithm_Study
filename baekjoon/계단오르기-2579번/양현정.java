import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N + 1];
        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; ++i) {
            score[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = score[1];
        if (N >= 2) dp[2] = score[1] + score[2];
        if (N >= 3) dp[3] = Math.max(score[2] + score[3], score[1] + score[3]);

        for (int i = 4; i <= N; ++i) {
            dp[i] = Math.max(score[i] + score[i - 1] + dp[i - 3], score[i] + dp[i - 2]);
        }

        System.out.print(dp[N]);
    }
}