import java.util.Scanner;
/*
 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 ex) n=4 m=2
 1 2/1 3/1 4/2 1/2 3/2 4/3 1/3 2/3 4/4 1/4 2/4 2 출력 
 같은수가 중복 될 수는 없지만 다른 숫자 조합의 배열은 가능 
 나 자신이외의 나머지 수가 모두 올수있음
 그래서 방문 배열을 만들어서 자신의 숫자는 true처리를 해주고
 두번쨰 배열에서 값을 구할떄 true가 된 자신의 수는 패스하고 그 다음 수부터 실행 
 그리고 출력된이후에는 방문했던 배열을 false 처리를 해준다.
 
 */

public class Main{
	public static int[] arr;
	public static boolean[] isVisited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		 
		 arr = new int[m];
		 isVisited = new boolean[n];
		 dfs(n,m,0);
		 	
	}
	
	
	public static void dfs(int n, int m, int depth) {
		if (depth == m) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<n; i++) {
			if( !isVisited[i] ) {
				isVisited[i] = true;
				arr[depth] = i+1;
				dfs(n,m,depth +1);
				isVisited[i] = false;
			}
		}
	}
	
}
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static int N;	// 정적변수로 변경
	public static int M;	// 정적변수로 변경
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		// 정적변수 N과 M을 초기화해준다.
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
 
		arr = new int[M];
		visit = new boolean[N];
        
		// 정적변수를 쓰면 되기 때문에 굳이 N과 M을 넘겨줄 필요 없다.
		dfs(0);
		System.out.println(sb);
 
	}
 
	public static void dfs(int depth) {
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(depth + 1);
				visit[i] = false;
			}
		}
	}
 
}
 
*/