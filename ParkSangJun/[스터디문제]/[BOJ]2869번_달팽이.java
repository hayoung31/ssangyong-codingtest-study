import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int day = (V - A) / (B - A);
        
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if ((V - A) % (B - A) != 0) {
			day++;
		}
		System.out.println(day);
		
		sc.close();

	}

}