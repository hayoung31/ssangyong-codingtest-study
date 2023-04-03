걸린 시간 : 
레벨 : 
주제 : 완전 탐색 문제

접근방법
1. 숫자야구 게임에서 완전탐색으로 받은 숫자를 어떻게 돌 것인가?
2. 모든 숫자 123 ~ 987 까지 (중복x) 제시된 각 자리의 숫자와 비교한다.
3. 비교한 결과 볼과 스트라이크 카운트가 일치하면 경우의 수를 증가시킨다.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;



public class Main {
	public static int n;
	public static int a[] = new int[10];
	public static int b[] = new int[10];
	public static int c[] = new int[10];
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(st.nextToken());
			c[i] = Integer.parseInt(st.nextToken());
		}
		
		int ans = 0;
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				for(int k = 1; k <= 9; k++) {
					if(i == j || i == k || j == k) {
						continue;
					}
					
					
					boolean successed = true;
					for(int m = 0; m < n; m++) {
						int cnt1 = 0;
						int cnt2 = 0;
						
						int num1 = a[m]  / 100;
						int num2 = a[m] / 10 % 10;
						int num3 = a[m] % 10;
						
						if(i == num1) {
							cnt1++;
						}
						if(j == num2) {
							cnt1++;
						}
						if(k == num3) {
							cnt1++;
						}
						
						if(num1 == j || num1 == k) {
							cnt2++;
						}
						if(num2 == i || num2 == k) {
							cnt2++;
						}
						if(num3 == i || num3 == j) {
							cnt2++;
						}
						
						if(cnt1 != b[m] || cnt2 != c[m]) {
							successed = false;
							break;
						}
					}
					if(successed) {
						ans++;
					}	
				}
			}
		}
		
		System.out.println(ans);
		
		
		
	}// end of main(String args[]) -----------------------------
		
	
}      