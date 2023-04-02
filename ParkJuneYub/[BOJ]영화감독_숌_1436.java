걸린 시간 : 30분
레벨 : 실버 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;



public class Main {
	
	public static boolean checkNum(int cnt) {
		String str = String.valueOf(cnt);
		
		if(str.contains("666")) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		int cnt = 100;
		while(n != ans) {
			cnt++;
			
			if(checkNum(cnt)) {
				ans++;
			}
		}
		
		System.out.println(cnt);
	}// end of main(String args[]) -----------------------------
		
	
}      