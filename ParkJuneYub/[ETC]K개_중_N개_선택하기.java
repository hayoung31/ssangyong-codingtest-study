걸린 시간 : 15분
레벨 : 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	static int k,n;
	static ArrayList<Integer> answer = new ArrayList<>();
	
	public static void print() {
		for(int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i) + " ");
			
		}
		System.out.println();
	}
	
	public static void choose(int currNum) {
		if(currNum == n+1) {
			print();
			return;
		}
		
		for(int i = 1; i <= k; i++) {
			answer.add(i);
			choose(currNum + 1);
			answer.remove(answer.size() - 1);
		}
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		choose(1);
		
		
	} 
}      // end of main(String args[]) -----------------------------