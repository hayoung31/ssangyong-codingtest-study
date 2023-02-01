import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fire = sc.nextInt();
		
		int [][] TP = new int [fire][2];
		
		for(int i=0; i<fire; i++) {
			for(int j=0; j<2; j++) {
				TP[i][j] = sc.nextInt();
				
			}
		}
		
		int [] dp = new int [fire+1];
		
		for (int i=0; i<fire; i++) {
			int t = TP[i][0];
			int p = TP[i][1];
			
			if (i+t < fire +1 ) {
				dp[i+t] = Math.max(dp[i]+ p, dp[i+t]);
			}
			dp[i+1] = Math.max(dp[i+1], dp[i]);
		}
		
		System.out.println(dp[fire]);
	
		
		
		sc.close();
	}

}
