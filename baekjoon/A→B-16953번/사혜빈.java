import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 사혜빈 {
	
	Queue<Long> Q = new LinkedList<>();
	
	public int BFS(long A, long B) {
		int L = 0;
		
		Q.offer(A);
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i = 0; i < len; i++) {
				long cur = Q.poll();
				if(cur == B) return L + 1;
				
				long next_lt = cur * 2;
				long next_rt = cur * 10 + 1;
				
				if(next_lt <= B) Q.offer(next_lt);
				if(next_rt <= B) Q.offer(next_rt);
			}
			L++;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		사혜빈 T = new 사혜빈();
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.print(T.BFS(A, B));

	}

}
