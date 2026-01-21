import java.util.Scanner;

public class 사혜빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		
		for(int i = 0; i < n; i++) {
			func(arr[i]);
		}
		
	}
	
	public static void func(String str) {
		char[] c = str.toCharArray();
		int lt = 0;
		int rt = str.length() - 1;
		
		while(lt < rt) {
			if(c[lt] == c[rt]) {
				lt++;
				rt--;
			}
			else {  
				if(palin(str, lt + 1, rt) || palin(str, lt, rt - 1)) {
					System.out.println("1");
				} else {
					System.out.println("2");
				}
				return;
			}
		}
		System.out.println("0"); // palindrome
	}
	
	public static boolean palin(String str, int lt, int rt) {
		char[] c = str.toCharArray();
		
		while(lt < rt) {
			if(c[lt] == c[rt]) {
				lt++;
				rt--;
			} else {
				return false;
			}
		}
		return true;
	}
	

}
