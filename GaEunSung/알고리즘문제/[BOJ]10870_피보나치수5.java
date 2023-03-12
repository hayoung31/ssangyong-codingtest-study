import java.io.*;
/// 재귀 함수를 이용해서 풀이하는 법 
public class Main {
		public static void main(String[] args) throws IOException {
			
		// 반복문을 이용해서 풀이하는법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 몇번째 수의 합을 구할껀지 입력
		int N = Integer.parseInt(br.readLine());
		// 문자열을 INT로 파싱
		System.out.println(fibonacci(N));
	    // 재귀함수 호출
 }
		// N값의 피보나치 수를 구하는 함수
		static fibonacci(int N) {
			if(N == 0) return 0; //0일떄 0
			if(N == 1) return 1; //1일떈 1
			return  fibonacci(N-1) + fibonacci(N-2); // 점화식을 이용한 N번째 피보나치 수 구하기 
			
		}
}