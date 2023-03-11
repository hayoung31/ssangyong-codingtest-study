import java.util.Scanner;

public class B1978번_소수찾기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int [] test = new int [N];
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			test[i] = sc.nextInt();
			if(test[i]>1) {
				for(int j=1; j<test[i]; j++) {
					if(test[i]%j == 0) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
		sc.close();

	}

}