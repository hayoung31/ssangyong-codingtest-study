package a.BOJ;

import java.util.Scanner;

public class BOJ_1436 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
//		1666 2666 3666 4666 5666 6660 6661 6662 6663 6664 6665 6666 6667 6668 6669 10666 11666 12666 13666
//		14666 15666 16660 16661 16662 16663 16664 16665 16666 16667 16668 16669 17666
		
		int number = 666;
		int count = 1;
		
		while ( count != n) {
					  // N번째 영화의 제목은 세상의 종말 (N번째로 작은 종말의 수) 와 같다.
			number++; // 666부터 1씩 계속증가하여 조건에 맞는지 검사하여 풀이
			
			if (String.valueOf(number).contains("666")) { // 숫자에 연속적인 666이 포함되어있으면 count 증가
				count++;				 // count의 값이 n과 같아질 때가 n번째 영화 제목이므로 그 number를 출력
			}
		}
		
		System.out.println(number);
		sc.close();
	}

}
