import java.util.Arrays;
import java.util.Scanner;

public class 사혜빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
//		Arrays.sort(arr); 강의 순서 못 바꿈
		
		int max = 0;
		for(int i = 0; i < n; i++) {
			max = Math.max(arr[i], max);
		}
		
		int lt = max;
		int rt = sum;
		int answer = 0;
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			int cnt = 1;
			int total = 0;
			for(int i = 0; i < n; i++) {
				
				if(mid >= arr[i] + total) {
					total += arr[i];
				} else {
					cnt++;
					total = arr[i];
				}
			}
			
			if(cnt <= m) {
				answer = mid;
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
		}
		
		System.out.print(answer);

	}

}
