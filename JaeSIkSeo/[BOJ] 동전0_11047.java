package a.BOJ;

import java.util.Scanner;

public class BOJ_11047 {

	public static void main(String[] args) {
		// 그리디 알고리즘
		int cnt = 0;
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int [] arr = new int [n];
		
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=n-1; i>=0; i--) { // 받은 동전 배열을 뒤에서부터 조건 확인
			if (arr[i] <= k) {  	 // 사용할 수 있는 최대 금액의 동전에 왔을때
				cnt += k / arr[i] ;  // 사용할만큼의 동전을 더하고
				k = k % arr[i] ;  	 // k 값을 다시 업데이트 해준다.
			}
		}
		sc.close();
		System.out.println(cnt);
		
	}

}
