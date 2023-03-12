package a.BOJ;

import java.util.Scanner;

public class BOJ_2869 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
/*
 * 		n 이 day라고 할때
 * 		식은 (a-b)n = v 이다 하지만 {2 1 5} 일때는 n값은 4가아닌 5이다.
 * 		마지막에 더해진 a 값이 정상이되면 떨어지지 않아야하는데 그래서 이 식은 맞지 않다.  
 * 		예를들어 n이 3일때 다음날 a값만 더해주면 5이지만 저 식에서는 b를 바로 빼주기 때문이다. 
 * 		
 * 		그래서 이런경우를 제외하려고 임시로 한개의 a만큼을 더해주는것을 n라고보고 나중에 결과값에 +1을 해준다. 
 * 		식은 (a-b)n + a = v가 된다.
 * 		이걸 n으로 정리하면 n = (v-a)/(a-b) 가 된다.
 */
		int result = (int)Math.ceil( (double)(v-a)/(a-b) ); 
		System.out.println(result+1);
		sc.close();
	}

}
