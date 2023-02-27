import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	public static int n, m;
	public static int[][] map;
	public static boolean[][] visited;
	public static boolean flag = false;
	
	public static boolean inRange(int x, int y) {
		return x >= 0 && x < n && y >= 0 && y < m;
	}
	
	public static boolean canGo(int x, int y) {
		if(inRange(x, y)) {
			if(map[x][y] != 0 && visited[x][y] == false) {
				return true;
			}
		}
		return false;
	}
	
	public static void DFS(int x, int y) {
		if(x == n-1 && y == m-1) {
			flag = true;
		}
		
		int[] dx = new int[] {0, 1};
		int[] dy = new int[] {1, 0};
		
		for(int i = 0; i < 2; i++) {
			int newX = x+dx[i];
			int newY = y+dy[i];
			
			if(canGo(newX, newY)) {
				visited[newX][newY] = true;
				DFS(newX, newY);
			}
		}
	}
	
	
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		visited[0][0] = true;
		DFS(0,0);
		
		if(flag) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		
		

		
	}// end of main(String args[]) -----------------------------
		
	
}      

