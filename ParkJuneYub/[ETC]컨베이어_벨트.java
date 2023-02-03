걸린 시간 : 20분
레벨 : 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int n, t;
	static int[][] arr;
	static int[] tmp;
	
	public static void moving() {
		while(t != 0) {
			
			for(int i = 0; i < 3; i++) {
				tmp[i] = arr[i][n-1];
			} // end of for ----------------------
			
			for(int i = 0; i < 3; i++) {
				
				for(int j = n-1; j >= 1; j--) {
					arr[i][j] = arr[i][j-1];
				}
				
			}
			
			arr[0][0] = tmp[2];
			arr[1][0] = tmp[0];
			arr[2][0] = tmp[1];
			
			t--;
		} // end of while ----------------------------
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		arr = new int[3][n];
		tmp = new int[3];
		
		for(int i = 0; i < 3; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		moving();
		
	}

}
