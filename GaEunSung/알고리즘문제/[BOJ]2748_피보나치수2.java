import java.io.*;
//피보나치의 수 
/*
 * int Fibonacci(int N) {
	if(N == 0) return 0;
	if(N == 1) return 1;
 
	return Fibonacci(N - 1) + Fibonacci(N - 2);
 */
public class Main {
		public static void main(String[] args) throws IOException {
			
		// 반복문을 이용해서 풀이하는법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		long sum = 1;
		long f1 = 0;
		long f2 = 1;
		
		
		for(int i=1; i<N; i++) {
			sum = f1 + f2;
			f1 = f2;
			f2 = sum;
		}
		
		System.out.println(sum);
				
 }
}
/*
 배열로 푸는 문제
Scanner scan = new Scanner(System.in);

// 몇번째 피보나치의 수인지 입력
int N = scan.nextInt();
// 피보나치의 수를 미리 입력해둘 배열 선언
int arr[] = new int[N + 1];

// 배열 초기값 입력
arr[0] = 0;
arr[1] = 1;

// 찾고싶은 순서의 값까지만 반복문 진행
for(int i = 2; i <= N; i++) {
	// 피보나치의 수 입력
	arr[i] = arr[i - 1] + arr[i - 2];
}

System.out.println(arr[N]);
}
*/
