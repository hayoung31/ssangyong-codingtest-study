package jdbc.day03.rw;

import java.util.Map;

public interface InterMemberDAO {
	// 회원가입(insert) 메소드
		int memberRegister(MemberDTO member);
		
		// 로그인 처리 (select) 메소드
		MemberDTO login( Map<String,String> paraMap);
}
