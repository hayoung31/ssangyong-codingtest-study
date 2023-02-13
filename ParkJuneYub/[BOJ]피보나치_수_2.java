걸린 시간 : 15분
레벨 : 브론즈 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	// n이 90 일때 어마어마한 숫자가 나온다.. 28억? 그렇기 때문에 int로는 표현할 수 없어서 long으로 표현해야 한다.
	
	static long n;
	static long[] memorization = new long[91];
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		
		memorization[1] = 1;
		memorization[2] = 1;
		for(int i = 3; i <= n; i++) {
			memorization[i] = memorization[i-1] + memorization[i-2];
		}
		
		System.out.println(memorization[(int) n]);
		
		
	}// end of main(String args[]) -----------------------------
		
	
}      