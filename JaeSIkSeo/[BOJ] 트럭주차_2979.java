package a.BOJ;

import java.util.Scanner;

public class BOJ_2979 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int [] time = new int [101]; // 시간은 1~100까지이므로 101
		for(int i=0; i<3; i++) {
			int start = sc.nextInt(); // 주차 시작시간
			int end = sc.nextInt();   // 떠나는 시간
			
			for (int j=start; j<end; j++) {
				time[j]++;			  // 주차가 시작된 시간만큼의 인덱스값만 ++해줌
			}
 		}
		
//		for (int i=0; i<time.length; i++) {  배열 확인용
//			System.out.print(time[i]);
//		}
		
		
		int pay = 0;
		for (int i=0; i<time.length; i++) {
			if (time[i] == 1) { 		// 인덱스 값이 1일경우 1대주차이므로 
				pay += (time[i] * A);
			}
			else if (time[i] == 2) {
				pay += (time[i] * B);
			}
			else {
				pay += (time[i] * C);
			}
		}
		
		
		System.out.println(pay);
		sc.close();
	}

}
