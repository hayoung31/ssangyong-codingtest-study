
import java.io.*;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		int count = 0; // 그룹단어의 갯수 
		int N = Integer.parseInt(br.readLine()); // 단어의 갯수 -- 숫자로 형변환 
		
		for(int i=0; i<N; i++) {
			if(check()) {
				count++;
			}
		}
		System.out.println(count);
	}
	// 단어가 그룹단어인지 체크해주는 메소드 
	// 나왔던 문자가 다시 등장하면 그룹단어가 아니다 
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26]; // 알파벳의 갯수만큼 체크
		int prev = 0;   
		String str = br.readLine(); // 체크할 단어 
		
		// 단어의 길이만큼  for
		for(int i=0; i<str.length(); i++) {
			int now = str.charAt(i); // 현재글자 
		// 앞에있는 문자와 i번째 문자가 다른경우 
		
			if(prev != now){
				
				//만약 b가 처음 나오는 경우 
				if(!check[now - 'a']) {
					check[now - 'a'] = true; 
					prev = now; // pre 를 갱신 
				}
				else { // b가 나왔던적 있는 경우(그룹단어 안댐 )
					return false;
				}
		    } 
			
		}// end of for 
		return true;

	}// end of public static boolean check() throws IOException

}// end  of main
