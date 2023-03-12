package my.practice;
//tes
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.close();
		
		String result = "";
		
		/*
		if(A>B)
			result = ">";
		else if(A<B)
			result = "<";
		else
			result = "=";
		*/
		// 삼항연산자의 중첩을 이용
		result = (A>B?">":(A<B?"<":"="));
		
		System.out.println(result);
		
		

	}

}
