import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [] numArr = new int [21]; // n+1을 햇엇는데 런타임에러떠서 찾아보니 한계를 지정해줘야한다고함
		
		numArr[0] = 0;
		numArr[1] = 1;
		
		for(int i = 2; i<=n; i++) { 
			numArr[i] = numArr[i-1] + numArr[i-2];
		}
		System.out.println(numArr[n]);
	}

}