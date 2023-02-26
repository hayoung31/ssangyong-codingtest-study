걸린 시간 : 60분
레벨 : 골드 4

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	// 시간초과가 났던 문제
	// 순열, 조합 문제이지만 모음과 자음을 인자로 주어서 불필요한 계산을 줄여서 풀어야 한다.
	// 시간초과가 나게 접근했던 방식 depth에 도달하면 모음과 자음 그리고 오름차순인지 체크 => 계산이 너무 많음
	// 1. 시간초과가 나지 않을려면? 글자 하나하나가 추가되기 위해서 오름차순인지 체크하고 추가
	// 2. 추가한 문자가 모음인지 자음인지 확인하고 카운팅 하기
	
	static int L, C;
	static char[] inputArr;
	
	public static void permutation(int depth, char[] arr, boolean[] visited, int vowel, int consonant) {
		if(depth == L) {
			
			if(vowel >= 1 && consonant >= 2) {
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]);
				}
				System.out.println();
			}
			
			return;
		}
		
		for(int i = 0; i < C; i++) {
			if(visited[i]) {
				
				visited[i] = false;
				arr[depth] = inputArr[i];
				if(depth == 0 || (arr[depth] > arr[depth-1]) ) {
					if(isConsistOfVowel(inputArr[i])) {
						permutation(depth+1, arr, visited, vowel+1, consonant);
					} else {
						permutation(depth+1, arr, visited, vowel, consonant+1);
					}
				}
				
				visited[i] = true;
			}
		}
	}
	
	public static boolean isConsistOfVowel(char chr) {
		
		if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
			return true;
		}
		return false;
	} 
	/*
	public static boolean isConsistOfAscending(char[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) return false;
			}
		}
		return true;
	}
	*/
	

	/*
	public static boolean isConsistOfConsonant(char[] arr) {
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if (cnt >= 2) return true;
			
			if(arr[i] != 'a' || arr[i] != 'e' || arr[i] != 'i' || arr[i] != 'o' || arr[i] != 'u') {
				cnt++;
			}
			
		}
		return false;
	}
	*/

	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		inputArr = new char[C];
		char[] printAnswer = new char[L];
		boolean[] visited = new boolean[C];
		Arrays.fill(visited, true);
		
		for(int i = 0; i < C; i++) {
			inputArr[i] = st.nextToken().charAt(0);	
		}
		
		Arrays.sort(inputArr);
		
		permutation(0, printAnswer, visited, 0, 0);
		
		
	}// end of main(String args[]) -----------------------------
		
	
}      