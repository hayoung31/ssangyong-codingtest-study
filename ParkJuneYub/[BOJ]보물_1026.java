걸린 시간 : 18분
레벨 : 실버 4

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
	static int[] a,b;

	// 한번 틀렸는데 그 이유는 아래다가 써놓았다.
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		a = new int[n];
		b = new int[n];
		boolean[] visited = new boolean[n];
		Arrays.fill(visited, false);
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a);
		
		for(int i = 0; i < n; i++) {
			int max = 0;
			int idx = 0;
			for(int j = 0; j<n; j++) {
				
				// b배열의 값이 max보다 크다가 아니라 크거나 같다고 해야 문제가 풀린다. 왜그럴까?
				// b배열의 값이 max보다 커야만 성립된다면 (b[j] <= 0) 작거나 같으면 arr[0]에 a[i]를 넘겨주게 된다. 즉 b[j]가 쭉 0 이라면 arr[0]에는 계속해서 a[i]가 쌓이는 것이다.
				// 즉 b[j] 가 0인 개수로 인해 arr[0]에 그 개수만큼 a[i]가 쌓임으로써 다른 arr의 배열에 가지 못해 arr값이 그냥 0으로 남게된다면 문제가 발생하는 것이다.
				if(b[j] >= max && !visited[j]) {
					max = b[j];
					idx = j;
				}
			}
			visited[idx] = true;
			arr[idx] = a[i];
		}
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += arr[i] * b[i];
		}
		System.out.println(sum);
		
		

		
		
		
	}// end of main(String args[]) -----------------------------
		
	
}      