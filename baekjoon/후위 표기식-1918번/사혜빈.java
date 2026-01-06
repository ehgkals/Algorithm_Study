package b1918;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		StringBuilder answer = new StringBuilder();
		
		Stack<Character> stack = new Stack<>();
		
		// 연산자 별로 우선순위를 매핑해야할지 아님 걍 내장되어있는지 몰으겟음
		Map<Character, Integer> map = new HashMap<>();
		map.put('*', 2);
		map.put('/', 2);
		map.put('+', 1);
		map.put('-', 1);
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			// 문자면 걍 출력 배열에 넣음
			if(Character.isLetter(c)) {
				answer.append(c);
			}
			else { // 연산자이면	
            	// 연산자 우선순위 먼저 고려
				stack.push(c);
				
				if(c == '(') {
					i++;
					c = input.charAt(i);
					if(c == ')') {
						while(c != '(') {
							answer.append(stack.pop());
						}
						stack.pop(); // 마지막 ( 빼기
					
					}
				}  
				else { // 스택 안 비어있으면
					System.out.println(c); 
					
					if(map.get(c) <= map.get(stack.peek())) // 같을 때 조건 추가
					{ //?
					answer.append(stack.pop());
					} stack.push(c);
				}
				
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