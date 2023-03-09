걸린 시간 : 9분
레벨 : 실버 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	

	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] moneyList = new int[n];
		
		for(int i = 0; i < n; i++) {
			moneyList[i] = Integer.parseInt(br.readLine());
		}
		
		int cnt = 0;
		
		for(int i = n-1; i >= 0; i--) {
			
			if(moneyList[i] <= k) {
				cnt += k / moneyList[i];
				k = k % moneyList[i];
			}
			
			if(k == 0) {
				break;
			}
		}
		
		System.out.println(cnt);
		
		
		
		
	}// end of main(String args[]) -----------------------------
		
	
}      
