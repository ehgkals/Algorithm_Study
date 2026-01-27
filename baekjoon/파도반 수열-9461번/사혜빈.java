import java.util.Scanner;

public class 사혜빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] test = new int[T];
		for(int i = 0; i < T; i++) {
			test[i] = sc.nextInt();
		}
		
		for(int i = 0; i < T; i++) {
			System.out.println(func(test[i]));
		}
		

	}
	
	public static long func(int n) {
		if(n <= 3) return 1;
		if(n <= 5) return 2;
		
		long[] P = new long[n + 1];
		
		P[1] = 1;
		P[2] = 1;
		P[3] = 1;
		P[4] = 2;
		P[5] = 2;
		
		for(int i = 6; i <= n; i++) {
			P[i] = P[i - 1] + P[i - 5];
		}
		
		return P[n];

	}

}
