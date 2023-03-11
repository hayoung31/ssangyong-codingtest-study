걸린 시간 : 45분
레벨 : 브론즈 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long v = Integer.parseInt(st.nextToken());
		
		long move = a - b;
		long day = 0;
		
		day = ((v - b) / move);
		if(((v - b) %  move) != 0) {
			day += 1;
		}
		

		System.out.println(day);
	}// end of main(String args[]) -----------------------------
		
	
}      