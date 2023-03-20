import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int jang = Integer.parseInt(st.nextToken()); // 카드 갯수
		
		int Max = Integer.parseInt(st.nextToken()); // 블랙잭 수
		
		int[]arr = new int [jang];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int black = 0; // 세수의 합
		int result = 0; // 결과치나오기 전까지 담을곳
		
		for(int i = 0; i< jang; i++) {
			for(int j = i+1; j< jang; j++) {
				for(int k = j+1; k< jang; k++) {
					black = arr[i] + arr[j] + arr[k];
					
					if(result < black && black <= Max) {
						 result = black;
					}
				}
			}
		}
		
		System.out.println(result);
		

	}

}