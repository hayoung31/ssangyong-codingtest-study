걸린 시간 : 
레벨 : 
주제 : 시뮬레이션 - 격자 안에서 터지고 떨어지는 경우

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;



public class Main {
	
	public static final int MAX_NUM = 100;
	
	public static int n, m, endOfArray, endOfTemp;
	public static int[] numbers = new int[MAX_NUM];
	public static int[] temp = new int[MAX_NUM];
	
	public static int getEndIdxOfExplosion(int startIdx, int currNum) {
		int endIdx = startIdx + 1;
		while(endIdx < endOfArray) {
			if(numbers[endIdx] == currNum)
				endIdx++;
			else {
				break;
			}
		}
		return endIdx -1;
	}
	
	public static void fillZero(int startIdx, int endIdx) {
		for(int i = startIdx; i <= endIdx; i++) {
			numbers[i] = 0;
		}
	}
	
	public static void moveToTemp() {
		endOfTemp = 0;
		for(int i = 0; i < endOfArray; i++) {
			if(numbers[i] != 0) {
				temp[endOfTemp++] = numbers[i];
			}
		}
	}
	
	public static void copy() {
		endOfArray = endOfTemp;
		for(int i = 0; i < endOfArray; i++) {
			numbers[i] = temp[i];
		}
	}
	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			
		}
		
		endOfArray = n;
		
		boolean didExplode;
		
		do {
			didExplode = false;
			for(int currIdx = 0; currIdx < endOfArray; currIdx++) {
				
				if(numbers[currIdx] == 0) {
					continue;
				}
				
				int endIdx = getEndIdxOfExplosion(currIdx, numbers[currIdx]);
				
				if(endIdx - currIdx + 1 >= m) {
					fillZero(currIdx, endIdx);
					didExplode = true;
				}
				
				
			}
			
			moveToTemp();
			copy();
		}
		while(didExplode);
		
		System.out.println(endOfArray);
        for(int i = 0; i < endOfArray; i++)
            System.out.println(numbers[i]);

		
	}// end of main(String args[]) -----------------------------
		
	
}      