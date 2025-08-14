import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
            set.add(d);
        }

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int d = sc.nextInt();
            if (set.contains(d)) {
                System.out.printf("%d ", 1);
            } else {
                System.out.printf("%d ", 0);

            }
        }
    }
}