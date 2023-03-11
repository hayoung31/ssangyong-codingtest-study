걸린 시간 : 24분
레벨 : 실버 2

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
	
	static int n;
	static int[] inputArr;
	static int ans= 0;
	
	public static void permutaion(int depth, int[] arr, boolean[] visited) {
		if (depth == n) {
			int maxSum = 0;
			
			for(int i = 0; i < n-1; i++) {
				maxSum += Math.abs(arr[i] - arr[i+1]);
				
			}
			
			ans = Math.max(maxSum, ans);
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(visited[i]) {
				visited[i] = false;
				arr[depth] = inputArr[i];
				
				permutaion(depth+1, arr, visited);
				visited[i] = true;
			}
		}
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		inputArr = new int[n];
		boolean[] visited = new boolean[n];
		int[] arr = new int[n];
		Arrays.fill(visited, true);
		st = new StringTokenizer(br.readLine());
		
		
		for(int i = 0; i < n; i++) {
			inputArr[i] = Integer.parseInt(st.nextToken());
		}
		
		permutaion(0, arr, visited);
		
		System.out.println(ans);
		
	}// end of main(String args[]) -----------------------------
		
	
}      