
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력 누적

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stackIn = new Stack<>(); 
        
        for (int i = 0; i < n; i++) {
        	String[] parts = br.readLine().split(" ");
        	
            
            if (parts.length == 1) {
                int a = Integer.parseInt(parts[0]);
                if(a == 2) {
                	if(!stackIn.isEmpty()) {
                		sb.append(stackIn.pop()).append("\n");
                		// pop은 제거함과 동시에 반환
                	} else sb.append(-1).append("\n");
                }
                if(a == 3) {
                	sb.append(stackIn.size()).append("\n");
                }
                if(a == 4) {
                	if(stackIn.isEmpty()) {
                		sb.append(1).append("\n");
                	} else sb.append(0).append("\n");
                }
                if(a == 5) {
                	if(stackIn.isEmpty()) {
                		sb.append(-1).append("\n");
                	} else sb.append(stackIn.peek()).append("\n");
                }

            } else {
                int b = Integer.parseInt(parts[1]);
                stackIn.push(b);
            }
        	
        }
        
        System.out.println(sb);
		
	}

	
}
