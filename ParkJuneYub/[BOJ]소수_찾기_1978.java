걸린 시간 : 6분
레벨 : 실버 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ans = 0;
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			int remainder = 0;
			for(int k = 1; k <= num; k++) {
				if(num % k == 0) remainder++;
			}
			if(remainder == 2) {
				ans++;
			}
		}
		
		System.out.println(ans);

	}

}
