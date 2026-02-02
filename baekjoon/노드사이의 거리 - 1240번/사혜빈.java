import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 사혜빈 {
	static int n, m;
	static ArrayList<ArrayList<int[]>> graph; 
	static int[] ch, dis;
	
	public static int BFS(int v, int e) {
		Queue<Integer> queue = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int cur = queue.poll();
			
			if(cur == e) return dis[cur];
			
			for(int[] next : graph.get(cur)) {
				int node = next[0];
				int weight = next[1];
				
				if(ch[node] == 0) {
					ch[node] = 1;
					dis[node] = dis[cur] + weight;
					queue.offer(node);
				}
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); // 4
		m = sc.nextInt(); // 2
		
		graph = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<int[]>()); 
		}
		
		for(int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d = sc.nextInt();
			
			graph.get(a).add(new int[]{b, d});
		    graph.get(b).add(new int[]{a, d});
		}
		
		for (int i = 0; i < m; i++) {
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    ch = new int[n+1];
			dis = new int[n+1];
			
		    System.out.println(BFS(x, y));
		}

		

	}

}
