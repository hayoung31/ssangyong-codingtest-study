import java.io.*;
import java.util.*;

public class Main  {
	public static void main(String[] args)throws IOException {
			
		/*
		 *  n개의 수를 받을 스캐너
		 *  Scanner sc = new Scanner(System.in);
		 *  int n = sc.nextInt();
		 *  int[] arr = new int[n];
		 */
		 	//bufferedReader를 사용하는 방법이 더 효율적이다 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			StringBuilder sb = new StringBuilder();
			
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			
			//받은 수를 어레이에 저장 
			for(int i=0; i < n; i++) {
				arr[i] = Integer.parseInt(br.readLine());
				
			}
			
			//배열안에 수들을 오름차순으로 정렬하기 
			Arrays.sort(arr);
			
			//어레이에 있는 수를 한줄에 하나씩 나오게 함 
			for(int val : arr) {
				sb.append(val).append('\n');
			}
			System.out.println(sb);
			
	}
}
/*
 BufferedReader나 BufferedWriter를 사용할 때에는 IO 예외처리를 해줘야 한다. 
 버퍼를 사용하기 때문인 것으로 보인다.
 */