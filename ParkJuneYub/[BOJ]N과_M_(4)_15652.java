걸린 시간 : 15분
레벨 : 실버 3

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
	
	static int n, m;
	static int[] inputArr;
	
	public static void permutation(int depth, int[] arr, int startNum) {
		if(depth == m) {
			for(int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = startNum; i < n; i++) {
			if(true) {
				
				arr[depth] = inputArr[i];
				
				permutation(depth+1, arr, startNum);
			}
			startNum++;
		}

	}

	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		inputArr = new int[n];
		int[] arr = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			inputArr[i] = i+1;
		}
		
		permutation(0, arr, 0);

		
	}// end of main(String args[]) -----------------------------
		
	
}      