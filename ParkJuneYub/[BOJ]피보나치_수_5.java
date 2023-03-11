걸린 시간 : 4분
레벨 : 브론즈 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[] memo;
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		memo = new int[21];
		
		memo[0] = 0;
		memo[1] = 1;
		memo[2] = 1;
		
		if(n >= 3) {
			for(int i = 3; i <= n; i++) {
				memo[i] = memo[i-1] + memo[i-2];
			}
			
		}
		System.out.println(memo[n]);
		
		
	}// end of main(String args[]) -----------------------------
		
	
}      


