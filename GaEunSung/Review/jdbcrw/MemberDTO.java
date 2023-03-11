package jdbc.day03.rw;
/*
 DTO(data transfer object, 데이터전송(운반) 객체
 테이블 1개의 행(row)
 테이블에 데이터를 insert하고자 할떄 DTO에 담아서 보냄
 select할때도 DTO에 담아서 읽어옴
 */
public class MemberDTO {
	// filed,attribute,속성
	// 테이블의 col들을 변수 선언해줌
	private int userseq;
	private String userid;             //회원아이디
	private String passwd;             //회원비밀번호
	private String name;               //회원명
	private String mobile;             //연락처
	private int point;                 //포인트
	private String registerday;        //가입일자
	private int status;                //status 컬럼의 값이 1 이면 가입된 상태, 0 이면 탈퇴
	
	//method, operation, 기능
	public int getUserseq() {
		return userseq;
	}
	
	public void setUserseq(int userseq) {
		this.userseq = userseq;
	}
	
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public String getRegisterday() {
		return registerday;
	}
	
	public void setRegisterday(String registerday) {
		this.registerday = registerday;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
}
