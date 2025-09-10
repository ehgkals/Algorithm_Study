import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt(); // 5
//		scanner.nextLine(); // 개행문자 제거 위해 추가
		String input = scanner.next(); // ABC*+DE/- nextLine 말고 next로 받으라고함
		
//		char[] operator = {'+', '-', '*', '/'};
		
		Stack<Double> stack = new Stack<>(); // 스택엔 숫자만 넣으니까 Integer로 함
		// ABC...에 숫자 넣어야 함 ㅜㅜ 이거 레알 모르겟음
		// 매핑해야되니까..
		// 해시맵
		Map<Character, Double> map = new HashMap<>();
		double n;
		for(int i = 0; i < num; i++) {
			n = scanner.nextDouble(); // 숫자 입력 받음
//			if(Character.isDigit(c)) if 필요없고 그냥 꺼내면 된다는데
			char c = (char)('A' + i); // 이렇게 하면 차례대로 문자 생성됨?
			map.put(c, n);
		}
		
		double answer = 0;
		for (int j = 0; j < input.length(); j++) { 
			// map에서 찾아서 넣어야 함
			char c2 = input.charAt(j); 
			if (Character.isLetter(c2)) {   // 알파벳이면
			    stack.push(map.get(c2));    // 실제 숫자 꺼내서 스택에 넣음
			}
			else { // operator면 숫자 꺼내서 계산, operator는 어케 저장함ㅜㅜ?
//				input.charAt(j); // c2에 저장해놨으니까 의미 없는 코드..
				double a = stack.pop(); // 처음에 꺼낸거
				double b = stack.pop();
				switch(c2) {
				case '+':
					answer = b + a;
					break;
				case '-':
					answer = b - a;
					break;
				case '*':
					answer = b * a;
					break;
				case '/':
					answer = b / a;
					break;
				}
				stack.push(answer);
			}
		}

//		System.out.printf("%.2f", answer); 스택에 최종 남아있는 값을 프린트해야함
		System.out.printf("%.2f\n", stack.pop());
		
		scanner.close();
	}

}

