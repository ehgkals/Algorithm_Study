import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 사혜빈 {

	static int n, m;
	static int[][] ch; // 1이면 방문 O, 0이면 방문 X
	
	public static void BFS(char[][] arr, int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		ch = new int[n][m];
		
		// 방향 배열 정의하기 
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

		int cnt = 0;
		
		ch[i][j] = 1;
		queue.offer(new int[]{i, j}); // 배열 하나 만들어서 바로 넣음
		
		while(!queue.isEmpty()) {
			int[] cur = queue.poll();
			int x = cur[0];
			int y = cur[1];
			
			if (arr[x][y] == 'P') cnt++;
			
			 for (int k = 0; k < 4; k++) {
				 int nextx = x + dx[k];
				 int nexty = y + dy[k];
				 
				 if (nextx < 0 || nexty < 0 || nextx >= n || nexty >= m) continue;
				 if (ch[nextx][nexty] == 1) continue;
			     if (arr[nextx][nexty] == 'X') continue;
			     
			     ch[nextx][nexty] = 1;
			     queue.offer(new int[] {nextx, nexty});
			 }


		}
		
		if (cnt == 0) System.out.println("TT");
		else System.out.println(cnt);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		char[][] arr = new char[n][m];
		
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.next().toCharArray();
		}
		
		int ix = 0;
		int iy = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr[i][j] == 'I') {
					ix = i;
					iy = j;
				}
			} 
		}
		
		BFS(arr, ix, iy);
	}

}
