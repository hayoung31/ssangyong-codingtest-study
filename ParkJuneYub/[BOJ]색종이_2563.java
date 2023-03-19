걸린 시간 : 30분
레벨 : 실버5

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
	


	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] map = new int[100][100]; // 100x100 도화지
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = 100-Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken())-1;
			
			int leftPointX = x-9;		// 좌측상단 좌표
			int leftPointY = y;
			
			for(int j = leftPointX; j <= x; j++) {	// 검은부분은 다 1로 지정
				for(int k = y; k < y+10; k++) {
					map[j][k] = 1;
				}
			}
		}
		
		int cnt = 0;
		
		for(int x = 0; x < 100; x++) {
			for(int y = 0; y < 100; y++) {
				if(map[x][y] == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
		
	}// end of main(String args[]) -----------------------------
		
	
}      