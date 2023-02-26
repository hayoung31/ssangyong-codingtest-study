package a.BOJ;

import java.util.Scanner;

public class BOJ_11727 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		int dp[] = new int [1001];
		dp[1]=1;
		dp[2]=3;
		
		for (int i=3; i<=n; i++) {
			dp[i] = (dp[i-1]+2*dp[i-2])%10007; // 정사각형도형이 추가됐으니 n-2 값의 두배
		}
		
		System.out.println(dp[n]);
		
		sc.close();
	}

}
