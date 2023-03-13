/*
피보나치 수 5

문제
피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.

출력
첫째 줄에 n번째 피보나치 수를 출력한다.

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;
 
public class Main { // 76ms
 //동적 계획법(Dynamic Programming) 풀이
	
	
	static long[] arr; // 배열 생성
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		
		arr = new long[N + 1];
		
		for(int i = 0; i < N + 1; i++) { // 메모이제이션(Memoization) 을 위해 배열의 초기값을 모두 -1로 설정
			arr[i] = -1;
		}
		
		
		System.out.println(Fib(N));
		
	}
	
	// 피보나치 함수
	public static long Fib(int N) {
		// base case 초기값 설정
		if(N == 0) {
			arr[N] = 0;
		}
		if(N == 1) {
			arr[N] = 1;
		}	
		// checking if already calculated 메모이제이션 즉, 하위문제를 다시풀지 않기 위해 이미 계산한 값인지 확인
		if(arr[N] != -1) {
			return arr[N];
		}
		// storing the result and returning 
		return arr[N] = Fib(N - 1) + Fib(N - 2);
	}
}


// 지난번처럼 그냥 반복문 돌린 것
/*

import java.util.*;
public class Main { //112ms

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[] arr = new long[21];// n은 20보다 작거나 같은 자연수 또는 0
		arr[0] = 0;	//피보나치를 돌리기 위해 기초값 지정
		arr[1] = 1;
				
		
		for(int i=1; i<n; i++) {	//for문으로 피보나치 구현.
			arr[i+1] = arr[i-1] + arr[i];
		}
		
		sc.close();
		
		System.out.print(arr[n]);
		
	}//end of main

}



*/
