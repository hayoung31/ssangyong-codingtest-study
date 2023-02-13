걸린 시간 : 50분
레벨 : 
주제 : 시뮬레이션 - 격자 안에서 밀고 당기기
	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class xy {
	int x;
	int y;
	
	xy(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	
	static int n, m, q;
	static int ans = 0;
	static int[][] map;
	static int[] visited;
	
	public static boolean checkSameColSameNum(int nextRow, int row) {
		if(nextRow < n && nextRow >= 0 && row < n && row >= 0) {
			for(int i = 0; i < m; i++) {
				if(map[row][i] == map[nextRow][i]) 
					return true;
			}
			return false;
		}
		return false;
	}
	
	public static void changeBuilding(int row, char dir) {
		char nextDir = 0;
		visited[row] = 1;
		//System.out.println(row + "visited");
		if(dir == 'L') {
			int tmp = map[row][m-1];
			for(int i = m-2; i >= 0; i--) {
				map[row][i+1] = map[row][i];
			}
			map[row][0] = tmp;
			
			/*
			for(int s = 0; s< m; s++) {
				System.out.print(map[row][s] + " ");
			}
			System.out.println();
			*/
			
			nextDir = 'R';
		}
		
		if(dir == 'R') {
			int tmp = map[row][0];
			for(int i = 1; i < m; i++) {
				map[row][i-1] = map[row][i];
			}
			map[row][m-1] = tmp;
			/*
			for(int s = 0; s< m; s++) {
				System.out.print(map[row][s] + " ");
			}
			System.out.println();
			*/
			
			nextDir = 'L';
		}
		
		// 1칸 아래 확인
		if(checkSameColSameNum(row, row+1) && visited[row+1] != 1) {
			changeBuilding(row+1, nextDir);
		}
		
		// 1칸 위 확인
		if(checkSameColSameNum(row, row-1) && visited[row-1] != 1) {
			changeBuilding(row-1, nextDir);
		}
		
		return;

	} // end of changeBuilding(int row, char dir) ----------------------
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		visited = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		} // end of for ----------------
		
		for(int i = 0; i < q; i++) {
			int row = 0;
			char direction;
			
			st = new StringTokenizer(br.readLine());
			
			row = Integer.parseInt(st.nextToken());
			direction = st.nextToken().charAt(0);
			
			changeBuilding(row-1, direction);
			Arrays.fill(visited, 0);
		} // end of for ----------------
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < m; j++) {
				System.out.print(map[i][j] + " ");
			}
			
			System.out.println("");
		} // end of for ----------------
		
	} // end of main(String args[]) -----------------------------
}