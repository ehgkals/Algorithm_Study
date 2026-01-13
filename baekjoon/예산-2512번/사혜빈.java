import java.util.Arrays;
import java.util.Scanner;

public class 사혜빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		int lt = 0;
		int rt = arr[n-1];
		
		int m = sc.nextInt(); // 485
		
		int answer = 0;
		while(lt <= rt) {
			int mid = (lt + rt) / 2;

			int min = 0;
			for(int i = 0; i < n; i++) {
				min += Math.min(arr[i], mid);
			}
			if(min <= m) {
				answer = mid;
				lt = mid + 1;
			}
			else {
				rt = mid - 1;
			}
		}
		
		System.out.print(answer);

	}

}
