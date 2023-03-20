package study;

import java.util.Scanner;

public class BOJ_2798 {

	public static void main(String[] args) {
		// n 숫자 입력개수
		// m 기준
		
		
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = search(arr, n, m);
		System.out.println(result);
		
	}
	
	static int search(int []arr, int n, int m) {
		// 이전 합
		int result = 0;
		
		// 0~3
		for(int i=0; i<n-2; i++) {
			//1~4
			for(int j=i+1; j<n-2; j++) {
				
				// 2~5
				for(int k=j+1; k<n; k++) {
					int temp = arr[i]+arr[j]+arr[k];
				
				
					if(m==temp) {
						return temp;
					}
					
					// 카드값이 이전합보다 크거나 m보다 작으면 실행하게 만들어 줌.
					if(result < temp && temp < m) {
						result = temp;						
					}
				
				
				}// end of for(int k=j+1; k<n; k++)---------------
				
			}// end of for(int j=i+1; j<n-2; j++)-----------------
			
			
		}// end of for(int i=0; i<n-2; i++)-------------------
		
		return result;
		
	} // end of static int search(int []arr, int n, int m)-------------

}

