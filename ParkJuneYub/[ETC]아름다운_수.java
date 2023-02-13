걸린 시간 : 32분
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
	static int answerCnt = 0;
	
	public static boolean checkBeautifulNum() {
		int cnt = 1;
		for(int i = 0; i < answer.size(); i++) {
			if(i == answer.size() - 1) {
				if(cnt % answer.get(i) == 0) {
					return true;
				}
				else {
					return false;
				}
			}
			
			if(answer.get(i) != answer.get(i+1)) {
				if(cnt % answer.get(i) == 0) {
					cnt = 1;
					continue;
				}
				else {
					return false;
				}
			}
			cnt++;
		}
		return true;
	}
	
	public static void choose(int currNum) {
		if(currNum == n+1) {
			if(checkBeautifulNum()) answerCnt++;
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
		
		k = 4;
		n = Integer.parseInt(st.nextToken());
		
		choose(1);
		System.out.println(answerCnt);
		
	} 
}      // end of main(String args[]) -----------------------------