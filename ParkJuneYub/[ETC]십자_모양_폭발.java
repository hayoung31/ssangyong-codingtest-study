걸린 시간 : 52분
레벨 : 
	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;



public class Main {
	
	public static int MAX_N;
	public static int[][] map;
	
	public static boolean isRange(int x, int y) {
		if(x < 0 || x >= MAX_N || y < 0 || y >= MAX_N) {
			return false;
		}
		
		return true;
	}
	
	public static void bomb(int x, int y) {
		int len = map[x][y];
		
		for(int i = x-(len-1); i <= x+(len-1); i++) {
			if(isRange(i, y)) {
				map[i][y] = 0;
			}
		}
		
		for(int i = y-(len-1); i <= y+(len-1); i++) {
			if(isRange(x, i)) {
				map[x][i] = 0;
			}
		}
		
		gravity();
	}
	
	public static void gravity() {

		int[][] tmpArr = new int[MAX_N][MAX_N];
		

		
		for(int y = 0; y < MAX_N; y++) {
			int tmpIdx = MAX_N-1;
			for(int x = MAX_N-1; x >= 0; x--) {
				if(map[x][y] != 0) {
					
					tmpArr[tmpIdx--][y] = map[x][y];
	
				}
			}
		}	
		map = tmpArr;
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MAX_N = Integer.parseInt(br.readLine());
		map = new int[MAX_N][MAX_N];
		StringTokenizer st;
		
		for(int i = 0; i < MAX_N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < MAX_N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		int bombX = Integer.parseInt(st.nextToken());
		int bombY = Integer.parseInt(st.nextToken());
		bomb(bombX-1, bombY-1);
		
		
		for(int x = 0; x < MAX_N; x++) {
			
			for(int y = 0; y < MAX_N; y++) {
				System.out.print(map[x][y] + " ");
			}
			System.out.println();
		}
		
	}// end of main(String args[]) -----------------------------
		
	
}      


