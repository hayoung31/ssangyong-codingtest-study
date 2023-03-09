걸린 시간 : 45분
레벨 : 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int map[][];
	static boolean visited[][];
	static int maxK;
	static int maxSafeZone;
	static int ansMinK = Integer.MAX_VALUE;
	
	public static boolean inRange(int x, int y) {
		if(x < 0 || x >= N || y < 0 || y >= M) {
			return false;
		}
		return true;
	}
	
	public static void dfs(int x, int y, int k) {
		visited[x][y] = true;
		
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		for(int i = 0; i < 4; i++) {
			int newX = dx[i] + x;
			int newY = dy[i] + y;
			
			if(inRange(newX, newY)) {
				
				if(visited[newX][newY] == false && map[newX][newY] > k) {
					dfs(newX, newY, k);
					
				}
			}
			
		}
		
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				int num = Integer.parseInt(st.nextToken());
				maxK = Math.max(maxK, num);
				map[i][j] = num;
			}
		}
		
		for(int k = 1; k <= 100; k++) {
			visited = new boolean[N][M];
			int cnt = 0;
			for(int x = 0; x < N; x++) {
				for(int y = 0; y < M; y++) {
					if(visited[x][y] == false && map[x][y] > k) {
						cnt++;
						dfs(x, y, k);
					}
					
				}
			}
			if(cnt > maxSafeZone) {
				maxSafeZone = cnt;
				ansMinK = k;
			}
			
			
		}
		if(maxK == 1) {
			maxSafeZone = 0;
			ansMinK = 1;
		}
		
		System.out.println(ansMinK+" "+maxSafeZone);
		
		
		
		
	
		
		
	}// end of main(String args[]) -----------------------------
		
	
}      
