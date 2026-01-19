import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 사혜빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		
		Deque<Character> dq = new ArrayDeque<>();
		for(char c : T.toCharArray()) {
			dq.addLast(c);
		}
		
		boolean isReversed = false;
		while(dq.size() > S.length()) {
			char last = isReversed ? dq.peekFirst() : dq.peekLast();
			
			if(last == 'A') {
				if(isReversed) dq.pollFirst();
				else dq.pollLast();
			} else { 
				if(isReversed) dq.pollFirst();
				else dq.pollLast();
				isReversed = !isReversed; // 뒤집기
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		while (!dq.isEmpty()) {
		    sb.append(isReversed ? dq.pollLast() : dq.pollFirst());
		}

		if (sb.toString().equals(S)) System.out.print("1");
		else System.out.print("0");

	}

}
