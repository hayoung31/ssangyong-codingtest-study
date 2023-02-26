import java.util.Scanner;
 /*
  * 중복가능 
  * for 문에서 사용할수 있는 i값들의 조합이 다 사용되서 배열에 들어갈수있음
  */
public class Main {
	
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		N = in.nextInt();
		M = in.nextInt();
 
		arr = new int[M];
        
		dfs(0);
		System.out.print(sb);
 
	}
 
	public static void dfs(int depth) {
		// 깊이가 M이랑 같아지면 출력후 return
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth + 1);
		}
	}
 
}