걸린 시간 : 66분
레벨 : 실버 3

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	// 잊지 말아야 할 점
	// 1. 뒤에서부터 채워나간다는 생각
	// 2. 뒤에서부터 채울 때 겹치지 않게끔 하기 ec) k-2는 3가지 방식이 있지만 1가지는 k-1과 겹치므로 제외한다.
	
	static int n;
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		int[] memo = new int[1001];
		
		memo[0] = 1;
		memo[1] = 1;
		memo[2] = 3;
		
		if(n >= 3) {
			for(int i = 3; i <= n; i++) {
				memo[i] = (memo[i-1] +  (memo[i-2] * 2 ) ) % 10007;
			}
		}

		System.out.println(memo[n]);
		
	}// end of main(String args[]) -----------------------------
		
	
}      
