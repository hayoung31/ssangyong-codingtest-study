package jdbc.day03.rw;

import java.sql.*;
import java.util.Map;



//DAO (data access object) ==> 데이터베이스에 연결하여 SQL문(DDL,DML,DQL)을 실핼시켜주는 객체
public class MemberDAO implements InterMemberDAO {

	// field, attribute, property 속성
	//instance 변수 자동적 null
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
    
	//methhod , operation 기능 
	
	// == 자원반납을 해주는 메소드 == //
		private void close() {
			try {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if(pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if(conn != null) {
					conn.close();
					conn = null;
				}
				
			}catch(SQLException e){
				e.printStackTrace();
			}
			
		}// end of private close()--------------------
		
	// === 회원가입insert)메소드 구현(생성)하기 ===	
	@Override
	public int memberRegister(MemberDTO member) {
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","JDBC_USER","glass");
			
			String sql = " insert into tbl_member(userseq, userid, passwd, name, mobile) "
					   + " values(userseq.nextval, ?, ?, ?, ?) ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,member.getUserid());
			pstmt.setString(2,member.getPasswd());
			pstmt.setString(3,member.getName());
			pstmt.setString(4,member.getMobile());
			
			result = pstmt.executeUpdate();
			
		}catch(ClassNotFoundException e) {
			System.out.println(">>> ojdbc.8 파일이 없습니다");
		}catch(SQLIntegrityConstraintViolationException e) {
			
			if( e.getErrorCode() == 1) {
				System.out.println(">> 아이디가 중복되었습니다. 새로운 아이디를 입력하세요 <<");
			}
			else {
				System.out.println("에러메시지 : " + e.getMessage());
			}		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();//자원반납
		}
		
		return result;
	}// end of memberRgister

	
	//로그인 처리(select)메소드 구현(생성) 하기
	@Override
	public MemberDTO login(Map<String, String> paraMap) {
		MemberDTO member = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","JDBC_USER","glass");
			
			String sql = " select userseq, name, mobile, point, to_char(registerday, 'yyyy-mm-dd') AS registerday "
					   + " from tbl_member "
					   + " where status = 1 and userid = ? and passwd = ? ";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,paraMap.get("userid"));
			pstmt.setString(2,paraMap.get("passwd"));
			
			rs = pstmt.executeQuery();
			
			if(rs.next() ) {
				member = new MemberDTO();
				
				member.setUserseq(rs.getInt("userseq"));
				member.setName(rs.getString("name"));
				member.setMobile(rs.getString("mobile"));
				member.setPoint(rs.getInt("point"));
				member.setRegisterday(rs.getString("registerday"));
				
			}
		
		}catch(ClassNotFoundException e) {
			System.out.println(">>> ojdbc.8 파일이 없습니다");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();//자원반납
		}
	
		
		return member;
	}// end of login


	

}
