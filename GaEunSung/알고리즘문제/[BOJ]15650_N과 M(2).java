import java.util.Scanner;
 /*
  * arr[0]의 숫자보다 +1 된수부터 뒤에 올수 있음 
  * 즉 무조권 arr[0]의 수보다 작은수가 뒤어올수없음 
  * 그러기 떄문에 초기 숫자인 at을 지정해주고 arr[1]넘어갈떄 at+1을 해줘서
  * 작은수는 올수 없게 설정해둔다 
  * 
  */
public class Main {
 
	public static int[] arr;
	public static int N, M;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		N = in.nextInt();
		M = in.nextInt();
 
		arr = new int[M];
        
		dfs(1, 0);
 
	}
 
	public static void dfs(int at, int depth) {
 
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
        
		for (int i = at; i <= N; i++) {
 
			arr[depth] = i;
			dfs(i + 1, depth + 1);
 
		}
	}
}