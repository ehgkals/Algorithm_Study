import java.util.Scanner;

public class 사혜빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 25
		int[] dp = new int[n + 1]; // 배열 크기 
		
		for (int i = 1; i <= n; i++) {
            dp[i] = i; 
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Integer.min(dp[i], dp[i - j * j] + 1);
            }
        }
		
		System.out.println(dp[n]);

	}

}
