package my.practice;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		
		// scanner로 입력받아 푸는 방법
		
		Scanner sc = new Scanner(System.in);
		// 테스트케이스를 입력받음 
		int t = sc.nextInt();
		
		//입력받은 수 만큼 배열을 만들고 각 배열에 10만큼의 숫자를 입력받아 
		//배열안에 차곡차곡 쌓음 
		
		for(int i=0; i<t; i++) {
			int [] numArr = new int[10];
			for(int j=0; j<10; j++) {
				numArr[j] = sc.nextInt();
			}
			// 입력받은 배열을 오름차수로 sorting 
			Arrays.sort(numArr);
			//세번쨰로 큰 수를 print
			System.out.println(numArr[7]);
		}
		//테스트 케이스숫자 만큼 반복!	
		
		// bufferedinputstream을 사용하여 푸는 법
		
		
		
	}// end of main() -----------------------------

}
