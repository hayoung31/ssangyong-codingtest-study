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
/*
 * (length - down)/(up-down) 도출과정
 * 여기서 문제는 달팽이가 낮에 정상에 도착했을 때는 밤을 계산하지 않는 것입니다. 그렇다면 기준을 낮으로 두면 됩니다.

		1일차 낮 = A
		1일차 밤 = A - B
		2일차 낮 = A - B + A
		2일차 밤 = A - B + A - B
		3일차 낮 = A - B + A - B + A
		3일차 밤 = A - B + A - B + A - B
		4일차 낮 = A - B + A - B + A - B + A
		4일차 밤 = A - B + A - B + A - B + A - B
		여기서 낮만 도출해보겠습니다.
		
		1일차 낮 = A
		2일차 낮 = A - B + A
		3일차 낮 = A - B + A - B + A
		4일차 낮 = A - B + A - B + A - B + A
		X일차 낮 = (A - B) * (X - 1) + A
		
		결과
		V = AX - A - BX + B + A
		V = X * (A-B) + B
		V - B = X * (A-B)
		X = (V - B) / (A - B)
		 
 */
