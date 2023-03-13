
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        
		//실험할 코드 추가
		
		Scanner sc = new Scanner(System.in);
		
		String abv = sc.nextLine();
		
		String[] abvArr = abv.split(" ");
		double a = Integer.parseInt(abvArr[0]);
		double b = Integer.parseInt(abvArr[1]);
		double v = Integer.parseInt(abvArr[2]);
		int i;
		
		i = (int) Math.ceil((v-b)/(a-b));
		//반복문으로 구할 수 없으니 식을 간단하게 만드는 법을 찾아봄.
		//낮에 애벌레가 도달한 값이 v보다 크거나 같으면 됨.
		//1일차 a
		//2일차 a-b-a
		//3일차 a-b-a-b-a
		// v =< ia-(i-1)b
		// v =< ia-ib+b
		// v =< i(a-b)+b
		// v-b =< i(a-b)
		// (v-b)/(a-b) =< i
		// 정수로 떨어질 때는 그냥 i 값 소수점으로 나올 때는 날자니 올림처리.
		// 주의할 점은 int/int는 정수로 나오니 abv의 타입을 더블로 잡아야함.
		
	/*
		for(i = 1; v-a>= 0; i++) {
			if(v-a>0) {
				v = v -a + b;
			}
			else
				break;
		}//end of for
		처음에 반복문으로 구하려했으나 시간초과가 나서 수정함.
	*/	

		System.out.println(i);
		
		
		        
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
		System.out.println("시간차이(m) : "+secDiffTime);
		
	}//end of main

}
