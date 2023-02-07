걸린 시간 : 50분
레벨 : 
주제 : DP

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	/*
	 *  문제내용
	 *  
	 	9 6 1 5 3 7 8 5
		3 4 2 5 7 8 7 9
		8 7 7 6 4 3 5 7
		3 6 8 9 5 7 7 9
		8 7 6 2 3 5 6 8
		1 2 3 4 5 2 3 5
		9 8 7 6 8 3 4 5
		6 5 4 6 3 7 9 9
		
		다음과 같이 8 * 8 크기의 행렬이 주어졌을 때, (1, 1)에서 시작하여 
		오른쪽 혹은 밑으로만 이동하여 (8, 8)로 간다고 했을 때 거쳐간 위치에 
		적혀있는 숫자의 합 중 가능한 최댓값은 어떻게 될까요?

	 */
	
	static int[][] arr;
	static int[][] result;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
		
		arr = new int[8][8];
		result = new int[8][8];
		
		
		for(int i = 0; i < 8; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 8; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				result[i][j] = 0;
			}
		}
		
		// 좌측상단 첫번째 값 초기화
		result[0][0] = arr[0][0];
		
		// 좌측, 우측 한줄 쭉 더하기
		for(int i = 1; i < 8; i++) {
			result[i][0] = arr[i][0] + result[i-1][0];
			result[0][i] = arr[0][i] + result[0][i-1];
		}
		
		// 최좌측 줄과 최상단 줄은 이미 누적되어 있고 이제 원소의 상단, 좌측 누적값과 비교하여 덧셈한다.
		for(int i = 1; i < 8; i++) {
			for(int j = 1; j < 8; j++) {
				result[i][j] = Math.max(result[i-1][j] + arr[i][j], result[i][j-1] + arr[i][j]);
			}
		}
		
		int maxSum = 0;
		for(int j = 0; j < 8; j++) {
			if(maxSum < result[7][j]);
			maxSum = result[7][j];
		}
		
		/*
		 *  값 출력
		 9 15 16 21 24 31 39 44 
		12 19 21 26 33 41 48 57 
		20 27 34 40 44 47 53 64 
		23 33 42 51 56 63 70 79 
		31 40 48 53 59 68 76 87 
		32 42 51 57 64 70 79 92 
		41 50 58 64 72 75 83 97 
		47 55 62 70 75 82 92 106 
		 * 
		 * 
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println("");
		}
		*/
		
		System.out.println(maxSum);
		
	}
}