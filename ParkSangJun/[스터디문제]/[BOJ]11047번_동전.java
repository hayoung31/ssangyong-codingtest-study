import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		
		int k = Integer.parseInt(st.nextToken());
		
		int[]coinlist = new int [n];
		
		for(int i=0; i<coinlist.length; i++) {
			coinlist[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		 
		for(int i = n -1; i>=0; i-- ) {  
			if( coinlist[i] <= k) {
				count += (k/coinlist[i]);
				k = k%coinlist[i];
			}
		}
		
		System.out.println(count);
		
	}

}