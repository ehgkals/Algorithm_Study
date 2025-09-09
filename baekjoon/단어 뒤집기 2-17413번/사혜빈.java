package b17413;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		Stack<Character> stack = new Stack<>();
		StringBuilder answer = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			if(c == '<') {
				
				while (!stack.isEmpty()) {
					answer.append(stack.pop());
                }
				
				while(c != '>') {
					answer.append(c);
					i++;
					c = input.charAt(i); 
					// ?? < 이후 문자를 끝까지 출력하려면 매 반복마다 c를 다시 읽어야함
					
				} answer.append(c);
			} else if (c == ' ') {
				while (!stack.isEmpty()) {
					answer.append(stack.pop());
                } answer.append(' ');
			} else {
				stack.push(c);
			}
		}
		
		// 남은 스택 처리
		while (!stack.isEmpty()) {
            answer.append(stack.pop());
        }
		
		System.out.println(answer.toString());
		
		scanner.close();
	}

}
