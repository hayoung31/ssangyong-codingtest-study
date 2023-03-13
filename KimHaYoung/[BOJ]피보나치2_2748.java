package study;


import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[] arr = new long[90];// 90보다 작거나 같은 자연수, n값이 커지면 int 타입의 범위가 넘어가니 long타입설정
		arr[0] = 1;	//피보나치를 돌리기 위해 기초값 지정
		arr[1] = 1;
				

		for(int i=2; i<n; i++) {	//for문으로 피보나치 구현.
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		sc.close();
		
		System.out.print(arr[n-1]);
		
	}//end of main

}
