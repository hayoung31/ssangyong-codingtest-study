걸린 시간 : 20분
레벨 : 실버5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;



public class Main {
	
	public static boolean checkString(String str) {
		LinkedList<Character> list = new LinkedList<>();
		
		for(int i = 0; i < str.length(); i++) {
			// 처음에는 무조건 넣음
			if(list.size() == 0) {
				list.add(str.charAt(i));
				continue;
			}
			// 그렇지 않으면 바로 이전 값과 같은 글자인지 비교함
			if(str.charAt(i) == str.charAt(i-1)) {
				continue;
			}
			// 바로 이전값과 같지 않다면 혹시 중복된 값인지 확인함
			list.add(str.charAt(i));
			Set<Character> listSet = new HashSet<>(list);
			if(list.size() != listSet.size()) {
				list.remove(list.size()-1);
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			if(checkString(str)) {
				ans++;
			}
		}
		
		System.out.println(ans);
		
		
	}// end of main(String args[]) -----------------------------
		
	
}      
