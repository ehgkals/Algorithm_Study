package b25418;

// 여기서부터 복붙해야함
import java.util.Scanner;

public class Main {

	// 연산1: 정수 A에 1 더하기
	// 연산2: 정수 A에 2 곱하기
	// Q. if 조건문에 && k / 2 >= a 이거 추가 안하면 틀리는 이유를 모르겟음
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int k = scanner.nextInt();

		
		System.out.println(f(a, k));
		
		scanner.close();

	}
	
	static int f(int a, int k) {
		int cnt = 0;
		
		while(a != k) {
			if(k % 2 == 0 && k / 2 >= a) {
				k = k / 2;
			} else {
				k = k - 1;
			}
			cnt++;
		}
		
		return cnt;
	}

}
