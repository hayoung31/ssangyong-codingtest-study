package study;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();//테스트케이스의 개수
		
		int[] intarr = new int[10];
		for(int i=9; i>=0; i--){
			intarr[i] = 0;
		}//nullpointerexception 을 피하기 위해서 배열의 초기값 설정
		
		for(int i = Integer.parseInt(test); i>0; i--) {//테스트 케이스 개수만큼 반복
			
			String str = sc.nextLine();
			String[] strarr = str.split(" "); //테스트 케이스 앞뒤로 공백이 없으니 spilt으로 문자열로 바꿈.
			
			for(int j=9; j>=0; j--) {
				
				intarr[j] = Integer.parseInt(strarr[j]); // 테스트케이스 넣은 string 타입 배열을  int 타입 배열로 바꿈.
			
				if(j==0) {
					Arrays.sort(intarr);// 오름차순으로 정렬
					System.out.println(intarr[7]); //N번째로 큰 수니 9,8,7 7번째 인덱스 출력.
				}//end of if	
					
			}//end of for
			
		}// end of for
		
		sc.close();
		
		
	}//end of main

}
