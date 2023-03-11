걸린 시간 : 28분
레벨 : 실버 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	// 기존 순열과 다른 점은 startNum 이라는 인자를 추가하여 한싸이클이 끝나면 순열의 시작 부분을 증가시킨다는 점이다.
	// 이를 통해 중복없이 뽑는 조합을 구현할 수 있다.
	
	static int n, m;
	
	static void permutation(boolean[] visited, int depth, int[] arr, int startNum) {
		if (depth == m) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("");
			return;
		}
		
		for (int i = startNum; i < n; i++) {
			if(visited[i]) {
				visited[i] = false;
				arr[depth] = i+1;
				permutation(visited, depth+1, arr, startNum);
				visited[i] = true;
			}
			startNum++;
		}
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Boolean flag = true;
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		boolean[] visited = new boolean[n];
		int[] arr = new int[m];
		Arrays.fill(visited, true);
		
		permutation(visited, 0, arr, 0);
		
		
	} // end of main(String args[]) -----------------------------
}