걸린 시간 : 20분
레벨 : 브론즈 2

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
	public static int a, b, c;
	public static int[] car = new int[100];
	
	public static void parking(int startTime, int endTime) {
		for(int i = startTime-1; i < endTime-1; i++) {
			car[i] += 1;
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			parking(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		int result = 0;
		
		for(int i = 0; i < 100; i++) {
			switch(car[i]) {
			case 0:
				break;
			case 1:
				
				result += a;
				
				break;
			case 2:
				
				result += 2*b;
				break;
			case 3:
				
				result += 3*c;
				break;
			}
		}
		System.out.println(result);
		
	}// end of main(String args[]) -----------------------------
		
	
}      


