걸린 시간 : 10분
레벨 : 브론즈2

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
	
	static int arr[];
	static int n, m;
	static int maxAns;
	
	public static void dfs(boolean[] visited, int[] ansArr, int cnt) {
		if(cnt == 3) {
			int sum = 0;
			for(int i = 0; i < 3; i++) {
				sum += ansArr[i];
			}
			
			if(sum >= maxAns && sum <= m) {
				maxAns = sum;
			}
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				ansArr[cnt] = arr[i];
				dfs(visited, ansArr, cnt+1);
				visited[i] = false;
			}
		}
	}


	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		int[] ansArr = new int[3];
		boolean[] visited = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i]  = Integer.parseInt(st.nextToken());
		}
		
		dfs(visited, ansArr, 0);
		System.out.println(maxAns);
		
	}// end of main(String args[]) -----------------------------
		
	
}      
