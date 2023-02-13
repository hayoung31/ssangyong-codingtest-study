걸린 시간 : 20분
레벨 : 브론즈 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> tmp = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 10; j++) {
				tmp.add(Integer.parseInt(st.nextToken()));
			}
			
			for(int num = 0; num < 3; num++) {
				int fir = tmp.get(0);
				int idx = 0;
				for(int com = 1; com < tmp.size(); com++) {
					if(fir < tmp.get(com)) {
						fir = tmp.get(com);
						idx = com;
					}
				}
				if(num == 2) {
					sb.append(tmp.get(idx)).append("\n");
					
				}
				tmp.remove(idx);
			}
			tmp.clear();
			
		}
		System.out.println(sb);	
	} // end of main(String args[]) -----------------------------
}
