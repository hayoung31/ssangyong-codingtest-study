import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
		public static void main(String[] args) {
			//풀이 1
			//1. 입력받기
			Scanner sc = new Scanner(System.in);
			//2. 입력받은 문자 양쪽에 공백제거
			String sentence = sc.nextLine().trim();
			//3.문장에 공백을 기준으로 단어를 배열로 만듬
			String [] words = sentence.split(" ");
			//4.스캐너 닫음
			sc.close();
			//5.문장이 공백이 아니면 배열의 갯수 (단어의 갯수를 나오게함)
			if( !sentence.isEmpty()) {
				System.out.println(words.length);
			}
			//6.아니면 단어가 없다는 0을 반환함
            else{
                System.out.println(0);
            }
	
	//////////////////////////////////////////////////////////////////
			//풀이 2
			//StringTokenizer을 이용하여 풀이
		
			Scanner sc = new Scanner(System.in);
			String sentence = sc.nextLine();
			sc.close();
			
			StringTokenizer st = new StringTokenizer(sentence," ");
			//" "을 기준으로 토큰을 생성 
			System.out.println(st.countTokens());
			//토큰의 갯수를 반환
			
		}			
				
}
