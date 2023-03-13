package a.BOJ;

import java.util.Scanner;

public class BOJ_1032 {

	public static void main(String[] args) {

		// char 2차원 배열로 문자를 비교해서 문자가 틀리면 ?로 치환
		
		Scanner sc = new Scanner (System.in);
		int n = Integer.parseInt(sc.nextLine());
		char temp [][] = new char [n][]; 
		
		for (int i=0; i<n; i++) {
			temp [i] = sc.nextLine().toCharArray();
		}
		
		if (n > 1) {

			for (int i=0; i<n-1; i++) { // 한개를 기준으로 계속 치환할것이기 때문에 n-1 반복
				
				for (int j=0; j<temp[i].length; j++) {
					
					if (temp[0][j] != temp[i+1][j]) { // 첫번째 입력된 값을 기준으로 다음거와 비교해서 다르면 물음표로 치환
						temp[0][j] = '?';
					}
				}
			}
		}
			
		System.out.println(temp[0]);
		
		sc.close();
	}

}
