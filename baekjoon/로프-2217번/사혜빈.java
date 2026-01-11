import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 사혜빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list, Collections.reverseOrder()); // list 내림차순 정렬
		
		ArrayList<Integer> max = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			max.add(list.get(i) * (i + 1));
		}
		Collections.sort(max, Collections.reverseOrder());
		System.out.print(max.get(0));
		


		
	}

}
