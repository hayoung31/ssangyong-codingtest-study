걸린 시간 : 79분
레벨 : 
주제 : 시뮬레이션 - 격자 안에서 밀고 당기기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int n, m, q;
	static int r1, c1, r2, c2;
	static int ans = 0;
	static int[][] map;
	static int[][] copyMap;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static boolean isRange(int x, int y) {
		if(x < 0 || x > n-1 || y < 0 || y > m-1) {
			return false;
		}
		return true;
	}
	
	public static void inputAverageVal(int r1, int c1, int r2, int c2) {
		for(int i = r1; i <= r2; i++) {
			for(int j = c1; j <= c2; j++) {
				map[i][j] = average(i, j);
			}
		}
	}
	
	public static void rotationBuilding(int r1, int c1, int r2, int c2) {
		/*
		 r1 c1					 r1 c2         

		 r2 c1			           r2 c2 
		 */
		
		// 좌측 상단(r1, c1) 우측 상단 (r1, m-1) 우측 하단(r2, m-1) 좌측 하단(r2, 0)
		int bottomLeft = map[r2][c1];
		
		// 하단을 왼쪽으로 땡기기          // 2 ~ 5
		for(int j = c1+1; j <= c2; j++) {
			map[r2][j-1] = map[r2][j];
		}
		
		// 우측 가로 아래로 땡기기
		for(int j = r2; j > r1; j--) { // 3 ~ 2
			map[j][c2] = map[j-1][c2];
		}
		
		// 상단 오른쪽으로 땡기기
		for(int j = c2; j > c1; j--) { // 5 ~ 2
			map[r1][j] = map[r1][j-1];
		}
		
		// 좌측 가로 위로 땡기기
		for(int j = r1; j < r2-1; j++) {
			map[j][c1] = map[j+1][c1];
		}
		
		map[r2-1][c1] = bottomLeft;
		


	} // end of changeBuilding(int row, char dir) ----------------------
	
	public static int average(int x, int y) {
		int sum = copyMap[x][y];
		int cnt = 1;
		
		for(int i = 0; i < 4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if(isRange(newX, newY)) {
				cnt++;
				sum += copyMap[newX][newY];
			}
			
		}
		return(sum / cnt);
		
	} // end of average(int x, int y)
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		copyMap = new int[n][m];

		
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		} // end of for ----------------
		
		for(int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			
			r1 = Integer.parseInt(st.nextToken());
			c1 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());
			c2 = Integer.parseInt(st.nextToken());
		
			
			rotationBuilding(r1-1, c1-1, r2-1, c2-1);
			
			// copy
			for(int k = 0; k < n; k++) {
				
				for(int j = 0; j < m; j++) {
					copyMap[k][j] = map[k][j];
				}
			} // end of for ----------------
			
			inputAverageVal(r1-1, c1-1, r2-1, c2-1);
		}
		
		

		
		
		// print
		for(int i = 0; i < n; i++) { 
			
			for(int j = 0; j < m; j++) {
				System.out.print(map[i][j] + " ");
			}
			
			System.out.println("");
		} // end of for ----------------
		
	} // end of main(String args[]) -----------------------------
}

