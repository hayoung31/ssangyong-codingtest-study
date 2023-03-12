package jdbc.day03.rw;

import java.util.*;

public class MemberCtrl implements InterMemberCtrl {
	//filed
	InterMemberDAO mdao = new MemberDAO();
	
	//method
	
	
	// 시작메뉴를 보요주는 메소드
	@Override
	public void menu_Start(Scanner sc) {
		
		MemberDTO member = null;
		String s_choice = "";
		
		do {
			String loginName = "";
			String login_logout = "로그인";
			
			if(member != null ) {
				loginName  =  "["+member.getName()+" 로그인중..]";
				login_logout = "로그아웃";
			}
			
			// 실행시 맨 처음 보이는 
			System.out.println("\n>>> -------- 시작메뉴 "+loginName+" -------<<<\n"
			         + " 1.회원 가입 2." + login_logout +" 3.프로그램 종료 \n"
			
			         +"----------------------------------------------------");
			//실행할 메서드를 선택
			System.out.println("메뉴번호 선택: ");
			s_choice  = sc.nextLine(); 
			
			//선택시 실행할 메서드
			switch (s_choice) {
			case "1":// //회원가입
				memberRegister(sc);
				break;
			case "2":
				if("로그인".equals(login_logout)) {
					member = login(sc);
				}
				else {
					member = null;
				}
				
				break;	
			case "3":// 프로그램 종료
				break;
			default:
				System.out.println(">>> 메뉴에 없는 번호입니다. 다시 선택하세요!!<<< \n");
				break;
			}// end of switch
		}while ( !("3".equals(s_choice)) );
	}// end of menustart()
	
	//**** 회원가입을 해주는 메소드
	private void memberRegister(Scanner sc) {
		System.out.println("\n===== 회원가입 =====\n");
		
		System.out.println("1.아이디: ");
        String userid = sc.nextLine();
		
		System.out.print("2. 비밀번호: ");
		String passwd = sc.nextLine();
		
		System.out.print("3. 회원명: ");
		String name = sc.nextLine();
		
		System.out.print("4. 연락처: ");
		String mobile = sc.nextLine();
		
		MemberDTO member = new MemberDTO();
		
		member.setUserid(userid);
		member.setPasswd(passwd);
		member.setName(name);
		member.setMobile(mobile);
		
		int n = mdao.memberRegister(member);
		

		if(n == 1) {
			System.out.println("/n >>> 회원가입을 축하드립니다 <<< ");
		}
		else {
			System.out.println("/n >>> 회원가입 실패 <<< ");
		}

	}// end of memberRegister
	
	// ** 로그인을 해주는 메소드 ** //
	private MemberDTO login(Scanner sc) {
		
		MemberDTO member = null;
	
	    System.out.print("ID: ");
	    String userid = sc.nextLine();
	 
	    System.out.print("비밀번호: ");
	    String passwd = sc.nextLine();
	    Map<String,String> paraMap = new HashMap<>();
	    
	    paraMap.put("userid",userid);
		paraMap.put("passwd",passwd);
		
		member =  mdao.login(paraMap);
		
		if(member != null) {
			 System.out.println("\n >>> 로그인 성공! <<< \n ");
		 }
		else {
			 System.out.println("\n >>> 로그인 실패! <<< \n ");
		 }
		return member;
		
	}//end of private login()---------------

}
