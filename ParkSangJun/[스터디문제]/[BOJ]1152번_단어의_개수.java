import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String munjang = sc.nextLine();
		
		String [] dan = munjang.split("\\s+");
		
		if (dan.length == 0) { //만약 아무것도 입력하지 않았다면 배열의 크기가 0이므로 배열[0] 이런식으로 접근하면 에러가 뜨므로 아예 0을 프린트 해주고 프로그램을 종료합니다.
			System.out.println(0);
			System.exit(0); //프로그램 강제 종료
		}
		if (dan[0] == "") { //배열의 맨 앞이 공백이면 공백은 단어가 아니므로 길이 -1
			System.out.println(dan.length - 1);
		}  else { //그 외에는 정상적으로 길이 출력
			System.out.println(dan.length);
		}
		
		
		
		sc.close();
		
		
		

	}

}