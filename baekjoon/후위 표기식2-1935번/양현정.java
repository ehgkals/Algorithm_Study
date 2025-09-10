import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int[] arr = new int[N];
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < N; ++i) arr[i] = Integer.parseInt(br.readLine());

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                stack.push((double)arr[c - 'A']);
            } else {
                double b = stack.pop();
                double a = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(a+b); break;
                    case '-':
                        stack.push(a-b); break;
                    case '*':
                        stack.push(a*b); break;
                    case '/':
                        stack.push(a/b); break;
                }
            }

        }
        System.out.printf("%.2f",stack.pop());
    }
}