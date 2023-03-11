package my.practice;
//test
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		sc.close();
		
		int num = 0;
		
		if(-1000<=x && x <=1000 && x !=0 && -1000<=y && y <=1000 && y !=0) {
			if(x>0 && y>0) {
				num = 1;
			}
			else if(x>0 && y<0) {
				num = 4;
			}
			else if(x<0 && y>0) {
				num = 2;
			}
			else
				num =3;
			
			System.out.println(num);
			
		}
		else {
			System.out.println("수는 -1000~1000사이에 수만 입력가능합니다. 또한 0도 불가 ");
			
		}//end if else- if
	
	}//end of main()-----------------

}
