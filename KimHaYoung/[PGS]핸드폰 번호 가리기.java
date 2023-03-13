/*
핸드폰 번호 가리기
문제 설명
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를
제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
*/

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i=0; i<phone_number.length(); i++) {
            if(i<phone_number.length()-4){
                answer += "*";
            }
            else
                answer += phone_number.charAt(i);
        }
        return answer;
    }
}

// 좋은 풀이 메모.
/*
	
 toCharArray()로 배열로 바꾼뒤 반복문을 통해 뒷4자리 제외한 앞자리 변경
 class Solution {
 
	  public String solution(String phone_number) {
	     char[] ch = phone_number.toCharArray();
	     for(int i = 0; i < ch.length - 4; i ++){
	         ch[i] = '*';
	     }
	     return String.valueOf(ch);
	  }
	}
*/

/*
정규식 lookahead(전방탐색)을 이용한 치환 방법

class Solution {
  public String solution(String phone_number) {
    return phone_number.replaceAll(".(?=.{4})", "*");
  }
}

.(?=.{4})

분석
.{4} 아무문자가 4개가 연달아 나오는 거
?=.{4} 아무문자가 4개가 연달아 나오는 경우 앞으로 탐색  // ?= (전방탐색) .{4}부분은 포함하지 않고 그 앞만 선택
.(?=.{4}) 아무문자가 4개가 연달아 나오는 것 앞에 있는 임의의 문자
replaceAll 이라서 다 바꾸니까 결과적으로 맨뒤 4자리 말고 그 앞에 모든 숫자를 바꾸는 것.

숫자만 있는 전화번호에서 뒷4자리만 빼면 되니까 .을 이용했는데
말그대로 숫자만 있으니까 \d 도 사용 가능 당연히 [0-9] 도 사용가능


*/


