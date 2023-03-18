package a.BOJ;

import java.util.Scanner;

public class BOJ_2563 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [][] square = new int [100][100];
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int j=x; j<x+10; j++) {		// 색종이가 놓여진 자리에는 +1을 계속더함
				for (int k=y; k<y+10; k++) {
					square[j][k] += 1;
				}
			}
		}
		
		int result = 0;
		for (int i=0; i<square.length; i++) {
			for (int j=0; j<square.length; j++) {
				if (square[i][j] >= 1) {		// 숫자와 상관없이 1이상인 곳은 색종이가 있는것이므로 이 넓이를 구함
					result += 1;
				}
			}
		}
		System.out.println(result);
		
//		for (int i=0; i<square.length; i++) {
//			for (int j=0; j<square.length; j++) {
//				System.out.print(square[i][j]);
//			}
//			System.out.println();
//		}
		
		sc.close();
	}

}
