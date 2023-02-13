import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = Integer.parseInt(sc.nextLine());
		
		int [][] test = new int [cnt][10];
				
			for(int i=0; i<cnt; i++) {
				
				for(int j=0; j<10; j++) {
					
					test[i][j] = sc.nextInt();
					
				}
				
				Arrays.sort(test[i]);
				
				System.out.println(test[i][7]);
			}
		sc.close();
	}

}