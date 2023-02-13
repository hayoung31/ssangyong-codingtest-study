package _2ssangyong;

import java.util.Scanner;

public class BOJ_2748 {
	
	static long[] Fib;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Fib = new long [N+1];
		
		Fib[0]=0;
		Fib[1]=1;
		
		for(int i=2; i<=N; i++) {
			Fib[i] = Fib[i-1]+Fib[i-2];
		}
		System.out.println(Fib[N]);
		
		
		sc.close();
	}
	

}

/*
 import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BOJ_2748 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		long sum = 1;
		long f1 = 0;
		long f2 = 1;
		
		for(int i = 1 ; i < N ; i++) {
			sum = f1 + f2;
			f1 = f2;
			f2 = sum;
			
			System.out.println("f1 = " + f1);
			System.out.println("f2 = " + f2);
			System.out.println("ㅋㅋㅋㅋ"+sum);
			
		}
		
		System.out.println(sum);
	}


} 
*/