import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	


	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	public static void main(String[] args) throws IOException{
 
		int cnt = 0;
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			if (check() == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
 
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26]; 
		int prev = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);	
			
			if (prev != now) {		
				
				if ( check[now - 'a'] == false ) { 
					check[now - 'a'] = true;
					prev = now;
				}
	 
				else {
					return false;
				}
			}
	        
			
			else {
				continue;
			}
		}    
		return true;
	}

}

/////////////////////////////////////////////////////////////////////////////////////
/*
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int cnt = 0;		
	int n = Integer.parseInt(br.readLine());
	
	for(int i=0; i<n; i++) {
		String str = br.readLine();
		
		boolean tf = true;
		
		boolean[] check = new boolean [26];
		int bf = 0;
		for(int j=0; j<str.length(); j++) {
			int af = str.charAt(j);
			
			if(bf != af) {
				if(check[af - 'a'] == false) {
					check[af - 'a'] = true;
					bf = af;
				}
				else {
					tf = false;
				}				
			}
			else {
				continue;
			}
		}
		
		
		if(tf = true) {
			cnt ++;
		}
		
	}
	
	System.out.println(cnt);

}
*/
