걸린 시간 : 19분
레벨 : 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int[][] map;
	static boolean[][] visited;
	
	static int cntBoomBlock;
	static int maxSizeBoomBlock;
	static int tmpCnt;
	
	public static boolean inRange(int x, int y) {
		if(x < 0 || x >= N || y < 0 || y >= N) {
			return false;
		}
		return true;
	}
	
	public static void dfs(int x, int y, int num) {
		//System.out.println("x : " + x + " y : " + y);
		visited[x][y] = true;
		
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		for(int i = 0; i < 4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if(inRange(newX, newY) && visited[newX][newY] != true && num == map[newX][newY]) {
				tmpCnt++;
				dfs(newX, newY, num);
			}
		}
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visited = new boolean[N][N];
		
		
		for(int x = 0; x < N; x++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int y = 0; y < N; y++) {
				map[x][y] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int x = 0; x < N; x++) {
			for(int y = 0; y < N; y++) {
				if(visited[x][y] != true ) {
					tmpCnt = 1;
					dfs(x, y, map[x][y]);
					
					maxSizeBoomBlock = Math.max(tmpCnt, maxSizeBoomBlock);
					if(tmpCnt >= 4) {
						cntBoomBlock++;
					}
					
				}
			}
		}
		
		System.out.println(cntBoomBlock + " " + maxSizeBoomBlock);
		
	}// end of main(String args[]) -----------------------------
		
	
}      