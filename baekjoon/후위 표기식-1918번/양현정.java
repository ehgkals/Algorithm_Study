import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> priority = Map.of('+', 1, '-', 1, '*', 2, '/', 2);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                System.out.print(c);
                continue;
            } else if (c == ')') {
                while (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                    System.out.print(stack.pop());
                }
                continue;
            }

            if (!stack.isEmpty()) {
                if (c == '(') {
                    stack.push(c);
                } else if (priority.containsKey(c)) {
                    while (!stack.isEmpty()
                            && priority.containsKey(stack.peek())
                            && priority.get(c) <= priority.get(stack.peek())) {
                        System.out.print(stack.pop());
                    }
                    stack.push(c);

                }
            } else {
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) System.out.print(stack.pop());
    }
}