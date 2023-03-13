걸린 시간 : 50분
레벨 : 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class xy {
	int x;
	int y;
	
	public xy(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	
	public static int n, m;
	public static int[][] map;
	public static boolean[][] visited;
	public static boolean flag = false;
	
	public static Queue<xy> q= new LinkedList<>();
	
	public static boolean inRange(int x, int y) {
		
		if(x < 0 || x >= n || y < 0 || y >= m) {
			return false;
		}
		
		return true;
	}

	// 큐에서 현재 지점을 뽑고 노드개수만큼 그래프의 arrayList를 돌면서 조건이 충족되면 방문표시하고 큐에 넣는다.
	public static void BFS() {
		
		while(!q.isEmpty()) {
			int x = q.peek().x;
			int y = q.peek().y;
			q.poll();
			
			if(x == n-1 && y == m-1) {
				flag = true;
			}
			
			int[] dx = {-1, 0, 1, 0};
			int[] dy = {0, 1, 0, -1};
			
			for(int i = 0; i < 4; i++) {
				int newX = dx[i] + x;
				int newY = dy[i] + y;
				
				if(inRange(newX, newY)) {
					
					if(!visited[newX][newY] && map[newX][newY] == 1) {
				
					
					visited[newX][newY] = true;
					q.add(new xy(newX, newY));
					}
				}
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
		
		for(int x = 0; x < n; x++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int y= 0; y < m; y++) {
				map[x][y] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		visited[0][0] = true;
		q.add(new xy(0, 0));
		
		BFS();
		
		if(flag) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

		
	}// end of main(String args[]) -----------------------------
		
	
}      
