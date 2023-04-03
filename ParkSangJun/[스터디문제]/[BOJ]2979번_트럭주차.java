import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 주차장에 주차하는 차의 대수당 가격
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int[]time = new int[101]; // 최대시간은 100시간이라 101로 잡음
		
		for(int i=0; i<3; i++) {
			st = new StringTokenizer(br.readLine());
			int parkin = Integer.parseInt(st.nextToken());
			int parkout = Integer.parseInt(st.nextToken());
			
			for(int j=parkin; j<parkout; j++) {
				time[j]++;
			}
		}
		
		int money = 0;
		for(int i=0; i<time.length; i++) {
			if(time[i] == 1) {
				money += time[i]*A;
			}
			else if(time[i] == 2) {
				money += time[i]*B;
			}
			else if(time[i] == 3) {
				money += time[i]*C;
			}
		}
		
		System.out.println(money);
		

	}

}
