import java.io.*;
import java.util.*;

public class Main  {
	public static void main(String[] args)throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 문자열 분리를 위해 " "으로 StringTokenizer을 통해 잘라줌
		
		int N = Integer.parseInt(st.nextToken()); // 카드의갯수
		int M = Integer.parseInt(st.nextToken()); // 카드세개의 합 
		int[] arr = new int[N]; // 카드를 담을 배열
		
		st = new StringTokenizer(br.readLine(), " "); // 카드를 받을 입력장치
		//받은 수를 어레이에 저장 
		for(int i=0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			// 각각의 카드를 N만큼 받아서 잘라서 배열에 차곡차곡 넣어준다. 
		}
		
		int result = search(arr,N,M);
		System.out.println(result);
	}
	
	// 세숫자의 합을 탐색하기 
	static int search(int[]arr, int N, int M) {
		int result = 0;
		 // 삼중 for문을 돌려서 세 숫자의 합을 구한다 
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					int temp = arr[i]+arr[j]+arr[k]; // 세수의 합
					if(temp <= M) {
						result = Math.max(result, temp);
					}// end of if 
			
				}// enf of for(3)
			}//enf of for(2)
		}// end of for(1)
		return result;
	}// end of search 
	
}
/*
 BufferedReader나 BufferedWriter를 사용할 때에는 IO 예외처리를 해줘야 한다. 
 버퍼를 사용하기 때문인 것으로 보인다.
 */

/*
 * 일단 버퍼드리더로 카드의 갯수인 N값을 받는다
 *  또한 세장의 합인 M값을 받아 N만큼의 배열을 생성하고 for문을 배열만큼 돌려서 값을
 * 받는다 그 값들중 M값과 같거나 가장 가까운 세수의 합을 출력
 * 5 21   ==> 한줄에 두 개의 숫자를 받기 때문에 nextToken()
 * 5 6 7 8 9
 */

		 