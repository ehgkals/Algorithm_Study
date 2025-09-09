import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 양현정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        char[] c = br.readLine().toCharArray();

        for (int i = 0; i < c.length; ++i) {
            char cc = c[i];

            if (cc == '<') {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }

                while (true) {
                    System.out.print(c[i]);
                    if(c[i] == '>') break;
                    i++;
                }
            } else if (cc == ' ') {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(' ');

            } else {
                stack.push(cc);
            }
        }

        while (!stack.isEmpty()) System.out.print(stack.pop());
    }
}