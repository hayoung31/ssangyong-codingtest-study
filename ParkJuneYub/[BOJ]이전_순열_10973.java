걸린 시간 : 120분
레벨 : 실버 3

접근방법 :
	1. 배열의 맨 뒤에서부터 i-1 > i 인 부분을 찾는다.
	2. 조건에 맞는 i-1을 찾는다면 다시 맨 뒤에서 부터 i-1 > j 인 j를 찾아 두개를 교체해준다.
	3. 이제 i 부터 다시 맨 뒤 j를 (i > j) 바꿔주고 i++, j--를 해주며 반복한다.
	4. 3번을 하는 이유는 내림차순으로 정렬해줘야 하기 때문이다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	static int n;
	static int[] arr;
	public static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	
	public static boolean beforePermutation() {
		int idxX = 0;
		int idxY = 0;

		// 뒤에서부터 하나씩 비교, 왼쪽 > 오른쪽 인 순간을 찾는다.
		int i = n-1;
		while(i > 0 && arr[i-1] <= arr[i]) {
			i--;
		}
		if(i <= 0) {
			return false;
		}
		idxX = i-1;
		idxY = i;
				
		// 오른쪽중에서 왼쪽 값보다 적은 첫번째 값을 찾아 왼쪽값과 교환한다.
		for(int k = n-1; k > 0; k--) {
			if(arr[idxX] > arr[k]) {
				swap(arr, idxX, k);
				break;
			}
		}
		
		// idxY부터 배열 끝가지 내림차순으로 정렬해준다.
		int j = n-1;
		while(idxY < j) {
			swap(arr, idxY, j);
			idxY++;
			j--;
		}
		return true;
	}
	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		boolean flag = true;
		arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		if(beforePermutation()) {
			for(int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
		} else {
			System.out.println(-1);
		}

	} 
}      // end of main(String args[]) -----------------------------