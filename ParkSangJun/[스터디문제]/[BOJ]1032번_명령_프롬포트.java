import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		char[]base = br.readLine().toCharArray();
		
		
		for(int i=0; i<n-1; i++) {
			char[]sc = br.readLine().toCharArray();
			for(int j=0; j<base.length; j++) {
				if(base[j] != sc[j]) {
					base[j] = '?';
				}
			}
		}
		System.out.println(base);
	}

}