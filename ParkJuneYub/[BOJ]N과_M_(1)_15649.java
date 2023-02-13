걸린 시간 : 28분
레벨 : 실버 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
	
	// 풀이법
	// 1. 순서가 정해진 수를 뽑는 방법 -> 순열 순열은 visited[]를 활용하자.
	// 2. 순열 함수를 만들고 거기에 방문 배열과 수를 저장할 배열 그리고 횟수를 넘긴다.
	// 3. 횟수가 꽉차면 프린트 할 수 있어야 하고 리턴한다 그렇지 않으면 횟수를 증가시키고 방문배열에 체크하고 다시 순열 함수를 재귀한다.
	
	
	static int n;
	static int m;
	public static void permutation(boolean[] visited, int[] arr, int cnt) {
		// 뽑은 횟수가 m이면 그만 뽑고 출력한다.
		if(cnt == m) {
			for(int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
				
			}
			System.out.println();
			
			return; // 계산이 끝나면 리턴해준다.
		}
		
		// 뽑은 횟수가 m보다 적으면 다음 값을 뽑는다.
		for(int i = 1; i<=n; i++) {
			if(visited[i] == true) {
				visited[i] = false;
				arr[cnt] = i;
				
				permutation(visited, arr, cnt+1);
				visited[i] = true;   // 
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		boolean[] visited;
		visited = new boolean[n+1];
		int[] arr = new int[m];
		Arrays.fill(visited, true);
		
		permutation(visited, arr, 0);
		
	}

}
