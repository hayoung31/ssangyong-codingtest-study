import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2309 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = 9;
		int[] a = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		} // end of for(int i=0; i<n; i++)-----
		
		Arrays.sort(a);		 
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(sum-a[i]-a[j]==100) {
					for(int k=0; k<n; k++) {
						if(i==k || j==k) {
							continue;
						}
						System.out.println(a[k]);
					} // end of for(int k=0; k<n; k++) -----
					System.exit(0);
				}
			} // end of for(int j=0; j<n; j++) -----
		} // end of for(int i=0; i<n; i++) -----
		

	} // end of main -----

}
