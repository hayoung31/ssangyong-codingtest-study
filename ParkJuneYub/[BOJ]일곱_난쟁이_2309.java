걸린 시간 : 7분
레벨 : 브론즈 1

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
	
	static int N = 9;
	static int[] inputArr;
	static int[] ans;
	static boolean answerFlag = false;
	
	public static void permutation(int depth, int[] arr, boolean[] visited) {
		if(depth == 7) {
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			
			if(sum == 100) {
				answerFlag = true;
				ans = arr;
			}
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(visited[i]) {
				visited[i] = false;
				arr[depth] = inputArr[i];
				permutation(depth + 1, arr, visited);
				visited[i] = true;
				
				if(answerFlag) {
					break;
				}
			}
		}
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());

		inputArr = new int[N];
		boolean[] visited = new boolean[N];
		int[] arr = new int[7];
		Arrays.fill(visited, true);
		
		for(int i = 0; i < N; i++) {
			inputArr[i] = Integer.parseInt(br.readLine());
		}
		
		permutation(0, arr, visited);
		
		Arrays.sort(ans);
		for(int i = 0; i < 7; i++) {
			System.out.println(ans[i]);
		}
		
		
	}// end of main(String args[]) -----------------------------
		
	
}      