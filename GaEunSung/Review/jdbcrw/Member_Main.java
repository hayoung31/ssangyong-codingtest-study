package jdbc.day03.rw;

import java.util.*;

public class Member_Main {

	public static void main(String[] args) {
		
		InterMemberCtrl mctrl = new MemberCtrl();
		Scanner sc = new Scanner(System.in);
		
		mctrl.menu_Start(sc);
		
		sc.close();
		System.out.println("프로그램 종료");
	}//emd of main

}
