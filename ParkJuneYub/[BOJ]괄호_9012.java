걸린 시간 : 15분
레벨 : 실버 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Boolean flag = true;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		LinkedList<Character> stack = new LinkedList<Character>();
		
		for (int i = 0; i < n; i++) {
			
			String inputStr = br.readLine();
			for (int j = 0; j < inputStr.length(); j++) {
				if (inputStr.charAt(j) == '(') {
					stack.add('(');
				} 
				else if(inputStr.charAt(j) == ')') {
					if(stack.size() == 0) {
						flag = false;
						break;
					}
					
					stack.pop();

				}
			}
			
			if(stack.size() != 0 || !flag) {
				sb.append("NO\n");
			} 
			else {
				sb.append("YES\n");;
			}
			
			flag = true;
			stack.clear();
			
		}
		System.out.println(sb);
		
	} // end of main(String args[]) -----------------------------
}

