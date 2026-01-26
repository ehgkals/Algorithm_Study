import java.util.Scanner;

public class 사혜빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] dp = new int[n + 2]; 
		dp[1] = 1;
		dp[2] = 3;
		for(int i = 1; i < n - 1; i++) {
			dp[i + 2] = (dp[i] * 2 + dp[i + 1]) % 10007;
		}
		
		System.out.print(dp[n]);
		
		// 오버플로우 위험
//		System.out.print(dp[n] % 10007);
		
	}

}
