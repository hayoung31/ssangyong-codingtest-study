
import java.util.*;


  public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] dp = new int[1001];// 최대가 1000이기 떄문에 최대수를 아예지정
		
		dp[1]= 1;//1*2의 경우의 수일때 1
		dp[2]= 2;// 2*1의 경우의 수일때 2
	 
		for(int i=3; i<=n; i++) {
			dp[i] = (dp[i-1]+ 2*dp[i-2])%10007;
			// 나머지값 출력 이유 너무 큰수가 나올까바
		}
		System.out.println(dp[n]);
	}//end of main()-----------------

}
