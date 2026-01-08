package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class b10867 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}
		
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		
		for(int x : list) {
			System.out.print(x + " ");
		}
		
		
//		String str = "";
//		for(int i = 0; i < n; i++) {
//			str += sc.next();
//		}
//		char[] ch = str.toCharArray();
//		
//		int j = 0;
//		for(int i = 0; i < n; i++) {
//			j = i + 1;
//			while(j != n) {
//				if(ch[i] == ch[j]) {
//					char temp = ch[i + 1];
//					ch[i + 1] = ch[j];
//					ch[j] = temp;
//				}
//				else if(ch[i] > ch[j]) {
//					char temp = ch[i];
//					ch[i] = ch[j];
//					ch[j] = temp;
//				}
//				j++;
//			}
//		}
//		
//		int lt = 0;
//		for(int i = 0; i < n - 1; i++) {
//			if(ch[i] != ch[i + 1]) {
//				System.out.print(ch[lt] + " ");
//			}
//			lt++;
//		}
//		
//		if(ch[n - 1] == ch[n - 2]) {
//			System.out.print(ch[n - 1]);
//		}
//		
	}

}
