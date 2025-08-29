import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; ++i) {
            String[] input = br.readLine().split(" ");
            int d = Integer.parseInt(input[0]);

            switch (d) {
                case 1:
                    stack.push(Integer.parseInt(input[1]));
                    break;
                case 2 :
                    System.out.println(stack.isEmpty() ? -1 : stack.pop());
                    break;
                case 3:
                    System.out.println(stack.size());
                    break;
                case 4:
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case 5:
                    System.out.println(stack.isEmpty() ? -1 : stack.peek());
                    break;
            }

        }
    }
}