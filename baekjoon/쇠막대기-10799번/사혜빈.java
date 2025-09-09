package b10799;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int answer = 0;
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			if(c == '(') {
				stack.push(c);
			}  else {
				stack.pop();
				if(input.charAt(i-1) == '(') {
					answer += stack.size();
				} else {
					answer ++;
				}
			}
		}
		
		System.out.println(answer);
		scanner.close();
	}

}

