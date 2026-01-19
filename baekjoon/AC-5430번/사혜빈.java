import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 사혜빈 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            String str = sc.next();   // RDD
            int arrNum = sc.nextInt();   // 4
            String arr = sc.next(); // [1, 2, 3, 4]

            Deque<Integer> dq = new ArrayDeque<>();

            if (arrNum > 0) {
                arr = arr.substring(1, arr.length() - 1); // 1, 2, 3, 4
                String[] nums = arr.split(","); 
                for (String s : nums) {
                    dq.add(Integer.parseInt(s));
                }
            }

            boolean isReversed = false;
            boolean error = false;

            // R 뒤집기, D 버리기
            for (char ch : str.toCharArray()) {
                if (ch == 'R') {
                    isReversed = !isReversed;
                } else { // D
                    if (dq.isEmpty()) {
                        error = true;
                        break;
                    }
                    if (isReversed) dq.pollLast();
                    else dq.pollFirst();
                }
            }

//            n--;
            
            // 출력
            if (error) {
                System.out.println("error");
            } else {
            	StringBuilder sb = new StringBuilder();
                sb.append("[");

                while (!dq.isEmpty()) {
                    sb.append(isReversed ? dq.pollLast() : dq.pollFirst());
                    if (!dq.isEmpty()) sb.append(",");
                }

                sb.append("]");
                System.out.println(sb);
            }
            
        }
    }
}
