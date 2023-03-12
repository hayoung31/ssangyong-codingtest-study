
import java.util.*;
import java.io.*;

  public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] dp = new int[1001];// 최대수를 아예지
		dp[1]= 1;//1*2의 경우의 수일때 1
		dp[2]= 2;// 2*1의 경우의 수일때 2
		// 
		for(int i=3; i<=n; i++) {
			dp[i] = (dp[i-1]+dp[i-2])%10007;
			// 나누는 이유 너무 큰수가 나올까바
		}
		System.out.println(dp[n]);
	}//end of main()-----------------

}
