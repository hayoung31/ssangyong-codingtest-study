package a.BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2750 {
	// 백준 2750번

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int [] list = new int [N];
		for (int i=0; i<N; i++) {
			list [i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(list);
		
		
		for (int i=0; i<N; i++) {
			System.out.println(list[i]);
		}
	}

}
