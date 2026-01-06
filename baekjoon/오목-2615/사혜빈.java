import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 사혜빈 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] map = new int[19][19];

		for (int i = 0; i < 19; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    for (int j = 0; j < 19; j++) {
		        map[i][j] = Integer.parseInt(st.nextToken());
		    }
		}
		
		// [같은 색]의 돌이, [연속] 5개
		// 오른쪽 방향 검사 j++
		for (int i = 0; i < 19; i++) {
		    for (int j = 0; j < 19; j++) {
		    	if (map[i][j] == 0) continue;
		    	
		    	int cnt = 1;
		    	int colored = map[i][j];
		    	
		    	int k = j + 1;
		    	while (k < 19 && map[i][k] == colored) {
		            cnt++;
		            k++;
		        }
		    	
		    	
		    	if(cnt == 5) {
		    		// 육목 제외
		    		if(k < 19 && map[i][k] == colored) continue;
		    		if(j - 1 >= 0 && map[i][j-1] == colored) continue;
		    		
		    		System.out.println(colored);
		    		System.out.println((i+1) + " " + (j+1));
		    		return;
		    	}
		    	
		    }
		}
	
		// 아래 방향
		for (int i = 0; i < 19; i++) {
		    for (int j = 0; j < 19; j++) {
		    	if (map[i][j] == 0) continue;
		    	
		    	int cnt = 1;
		    	int colored = map[i][j];
		    	
		    	int k = i + 1;
		    	while (k < 19 && map[k][j] == colored) {
		            cnt++;
		            k++;
		        }
		    	
		    	if(cnt == 5) {
		    		// 육목 제외
		    		if(i - 1 >= 0 && map[i-1][j] == colored) continue;
		    		if(k < 19 && map[k][j] == colored) continue;
		    		
		    		System.out.println(colored);
		    		System.out.println((i+1) + " " + (j+1));
		    		return;
		    	}
		    	
		    }
		}
		
		// 대각선 아래
		for (int i = 0; i < 19; i++) {
		    for (int j = 0; j < 19; j++) {
		    	if (map[i][j] == 0) continue;
		    	
		    	int cnt = 1;
		    	int colored = map[i][j];
		    	
		    	int k = i + 1;
		    	int l = j + 1;
		    	while (k < 19 && l < 19 && map[k][l] == colored) {
		            cnt++;
		            k++;
		            l++;
		        }
		    	
		    	if(cnt == 5) {
		    		// 육목 제외
		    		if(i-1 >= 0 && j-1 >= 0 && map[i-1][j-1] == colored) continue;
		    		if(k < 19 && l < 19 && map[k][l] == colored) continue;
		    		
		    		System.out.println(colored);
		    		System.out.println((i+1) + " " + (j+1));
		    		return;
		    	}
		    	
		    }
		}
		
		// 대각선 위
		for (int i = 0; i < 19; i++) {
		    for (int j = 0; j < 19; j++) {
		    	if (map[i][j] == 0) continue;
		    	
		    	int cnt = 1;
		    	int colored = map[i][j];
		    	
		    	int k = i - 1;
		    	int l = j + 1;
		    	while (k >= 0 && l < 19 && map[k][l] == colored) {
		            cnt++;
		            k--;
		            l++;
		        }
		    	
		    	if(cnt == 5) {
		    		// 육목 제외 : k-- 주의
		    		if(j-1 >= 0 && i+1 < 19 && map[i+1][j-1] == colored) continue;
		    		if(l < 19 && k >= 0 && map[k][l] == colored) continue;

		    		
		    		System.out.println(colored);
		    		System.out.println((i+1) + " " + (j+1));
		    		return;
		    	}
		    	
		    }
		}
		
		System.out.println("0");

	}

}
