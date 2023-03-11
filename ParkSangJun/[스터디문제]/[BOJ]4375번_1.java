import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String s = br.readLine();
			
			if(s == null) {
				break;
			}
			
			int num = 0;
			int a = Integer.parseInt(s);
			
			for(int i=1; ; i++) {
				num = num * 10 +1;
				num = num% a;
				if(num == 0) {
					System.out.println(i);
					break;
				}
			}
		}
		
		
	}

}