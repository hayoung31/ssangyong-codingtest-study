걸린 시간 : 34분
레벨 :

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	// dfs 문제
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int cnt = 0;
	
	public static boolean inRange(int x, int y) {
		if(x < 0 || x >= N || y < 0 || y >= N) {
			return false;
		}
		return true;
	}
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		cnt++;
		for(int i = 0; i < 4; i++) {
			int newX = dx[i] + x;
			int newY = dy[i] + y;
			
			if(inRange(newX, newY) && !visited[newX][newY] && map[newX][newY] != 0 ) {
				dfs(newX, newY);
			}
		}
		return;
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int x = 0; x < N; x++) {
			for(int y = 0; y < N; y++) {
				if(!visited[x][y] && map[x][y] != 0) {
					dfs(x, y);
				}
				
				if(cnt >= 1) {
					list.add(cnt);
				}
				cnt = 0;
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}// end of main(String args[]) -----------------------------
		
	
}      