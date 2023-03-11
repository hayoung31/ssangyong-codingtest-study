package a.BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2309 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int sum = 0; // 9명의 합을 구하는 sum
		int arr[] = new int [9]; //
		
		for (int i =0; i<9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) { // 9개중 2개의 숫자를 빼서 더한값이 100이면 되는 조건
				if (sum - arr[i] - arr[j] == 100) {
					for (int k=0; k<9; k++) {
						if (i==k || j==k) { // 해당 숫자를 찾으면 생략 나머지는 정답 출력
							continue;
						}
						System.out.println(arr[k]);
					}
					System.exit(0);
				}
				
			}
		}
		
		sc.close();
	}

}
