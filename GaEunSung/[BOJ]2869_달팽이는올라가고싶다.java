package my.practice;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int up = sc.nextInt();
		int down = sc.nextInt();
		int length = sc.nextInt();
		
		int day = (length - down)/(up-down);
		
		if( (length - down)%(up-down) != 0) {
			day++;
		}
		System.out.println(day);
		
	}// end of main() -----------------------------

}
