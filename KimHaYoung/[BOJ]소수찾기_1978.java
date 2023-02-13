import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int num1 = Integer.parseInt(num);
		String num2 = sc.nextLine();
		String[] num2str = num2.split(" ");
		
		int[] num2int = new int[num1];
		Arrays.fill(num2int, 0); //Arrays.fill 로 초기갑설정
		
		
		for(int i=0; i<num2str.length; i++) {
			num2int[i] = Integer.parseInt(num2str[i]); //스트링 타입배열 인트타입배열로 변환
		}//end of for
		
		int count =0;
		for(int i = num1; i>0; i--) {
			
			for(int j = 2; j<=num2int[i-1]; j++) {// 소수니 2부터 시작으로 해서 1로 나누는 경우를 없앰.
				
				if(1 == num2int[i-1]) //1은소수가 아니니 반복문 빠져나감
					break;
						
				if(num2int[i-1]%j==0) {
					if(num2int[i-1]!=j)//j로 나눠졌는데 j랑 같지 않으면 소수가 아니니 반복문을 빠져나감
						break;
					if(num2int[i-1]==j)//소수 count++
						count++;
					}
				
			}//end of for
		}//end of for
		
		System.out.println(count);
		
		

	}

}

//변수명이 너무 더러워서 협업이 힘드니까 구글에서 변수명 찾아보고 그걸로 따라가자
