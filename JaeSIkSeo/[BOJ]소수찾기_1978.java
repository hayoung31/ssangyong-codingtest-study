package a.BOJ;

import java.util.Scanner;

public class BOJ_1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int num ; // 입력받는 숫자
		int count = 0; 
		int count2 = 0; // 조건에 맞을 카운트
		
		for (int i=0; i<N; i++) {
			num = sc.nextInt();
			count2 = 0; // 하나의 숫자가 판별이 끝나면 다시 초기화
			
			for (int j=1; j<=num; j++) {
				
				if (num % j ==0) { // 나누어 떨어지는게 1과 자기자신밖에 없기 때문에 
								   // 그 두가지만 충족이되면 (count2가 두개일경우에만) count++
					count2++;
				}
			} 
			if (count2 == 2) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
