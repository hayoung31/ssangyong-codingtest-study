package a.BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2693 {

	public static void main(String[] args) {
		
//		배열 A가 주어졌을 때, N번째 큰 값을 출력하는 프로그램을 작성하시오.
//		배열 A의 크기는 항상 10이고, 자연수만 가지고 있다. N은 항상 3이다.
//
//		입력
//		첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고,
//		배열 A의 원소 10개가 공백으로 구분되어 주어진다. 이 원소는 1보다 크거나 같고, 1,000보다 작거나 같은 자연수이다.
//		출력
//		각 테스트 케이스에 대해 한 줄에 하나씩 배열 A에서 3번째 큰 값을 출력한다.
		
		Scanner sc = new Scanner (System.in);
		int N = Integer.parseInt(sc.nextLine());
		int [][] arr = new int [N][10]; // 2차원 배열 선언 N개만큼 10개씩 받는다.
		
		for (int j=0; j<N; j++) {
			for (int i=0; i<10; i++) {
				arr[j][i] = sc.nextInt();
			}
			Arrays.sort(arr[j]); // j열만 정렬해서 3번째 큰순 출력.
			System.out.println(arr[j][7]);
		}
		
		sc.close();
	}

}
