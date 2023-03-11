걸린 시간 : 125분
레벨 : 실버3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	// 1. 1, 11, 111, 1111 10씩 곱하고 1 더하는 값을 나눠서 0으로 떨어지는 방식을 찾으면 시간초과 나타난다.
	// 2. 모듈러 연산공식을 활용한다. (a * b) % n = { (a % n) * (b % n) } % n
	// 3. 예시 3을 입력받았을 때 
	/*
	 * 
	 1 % 3 = 1
	 
	11 % 3 = (1*10 + 1) % 3 = (1%3 * 10 + 1) % 3 =2
	11 % 3 = 1* 10 + 1 =2
	
	왜 모듈러 연산공식인 ((1&3 * 10%3)%3 + 1%3)%3 으로 표현하지 않나요?
	문제에서 2와 5로 나눠지지 않는다고 해서 10을 굳이 나누지 않은 겁니다.
	앞에서 구한 나머지만 식에서 바꿔주고 어차피 뒤에 계산은 나머지에 포함되기 때문입니다.
	
	
	111 % 3 =  (11*10+1)%3 = 0   
	111 % 3 =  (11*10+1) % 3  = (2 * 10 + 1) % 3 = 0
	
	그러면 111을 구할 때 우리가 2를 넘겨주면 어떨까?라는 생각에서 코딩해야한다.
	
	 * */
	
	static long n;
	static int cnt = 1;
	static StringBuilder sb = new StringBuilder();
	
	public static void findBaesoo() {
		cnt = 1;
		long num = 1;
		while((num % n) != 0) {
			num = num * 10 + 1;
			num = num % n;
			cnt++;
		}
		System.out.println(cnt);

		
	}

	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputLine = null;
		
		while(true) {
			inputLine = br.readLine();
			if(inputLine != null) {
				n = Long.parseLong(inputLine);
				findBaesoo();
			}
			else {
				break;
			}
		}

		
	}// end of main(String args[]) -----------------------------
		
	
}    