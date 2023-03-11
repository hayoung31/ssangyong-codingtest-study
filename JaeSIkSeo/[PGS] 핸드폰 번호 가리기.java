package a.PGS;

public class PGS_핸드폰번호가리기 {
	
	public String solution(String phone_number) {
        String answer = "";
        char [] temp = new char [phone_number.length()]; // char 배열을 거꾸로 이용해 4자리만 사용하려고 char 배열생성
        String number = "";								 // 뒤의 4자리만 담을 변수
        StringBuffer sb = new StringBuffer ();			 // 거꾸로돌린 number reverse 하기위해 생성
        
        temp = phone_number.toCharArray();				
        
        for (int i=temp.length-1; i>=0; i--) {			 // for문을 이용해 번호를 뒤에서부터 거꾸로 전환
        	answer += temp[i];	
        }
        
        sb.append(answer.substring(0, 4)); 				 // 4자리만 담아서 거꾸로 변환한 뒤 number에 담음
        sb.reverse();
        number = sb.toString();
        answer = "";
        
        for (int i=0; i<temp.length-4; i++) {		     // 번호의 4자리 제외 모두 *로 변환
        	answer += "*";
        }
        answer += number;
        
        return answer;
    }

	public static void main(String[] args) {

	}

}
