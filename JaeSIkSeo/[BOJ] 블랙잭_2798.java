package a.BOJ;

import java.util.Scanner;

public class BOJ_2798 {

	public static void main(String[] args) {
		//https://www.youtube.com/watch?v=CrleLfZAyAI

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int [n];
		int result = 0;
		
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		
		for (int i=0; i<n-2; i++) {
			for (int j=i+1; j<n-1; j++) {
				for (int k=j+1; k<n; k++) {
					int temp = arr[i] + arr[j] + arr[k];
					
					if (temp == m) { 	// 최대값을 찾은경우
						System.out.println(temp);
						return;
					}
					
					if (result < temp && temp < m) { // 최대값에 계속 근접할경우 result 갱신 
						result = temp;
					}
				}
			}
		}
		
		System.out.println(result);
	
	}

}
