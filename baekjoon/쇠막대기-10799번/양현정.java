import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 양현정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        char[] c = br.readLine().toCharArray();
        int answer = 0;

        for (int i = 0; i < c.length; ++i) {
            char cur = c[i];
            if (cur == '(') {
                stack.push(cur);
            } else if (cur == ')' && c[i - 1] == '(') {
                stack.pop();
                answer += stack.size();
            } else {
                answer++;
                stack.pop();
            }
        }

        System.out.println(answer);
    }
}