class Solution {
    public String solution(String phone_number) {
        String answer = "";
      for(int i = 0; i < phone_number.length(); i++){
         if(i < phone_number.length()-4){
             answer += "*";
         }
         else{
             answer += phone_number.charAt(i);
         }
      }
      return answer;
  }
}

/*
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[]pn= String phone_number.split("");
        for(int i=0; i<pn.length; i++){
        	if(i < phone_number.length()-4){
             answer += "*";
         	}
         	else{
         	 answer += pn[i];
         	}
         	return answer;
          }	
        }
*/

/* --- 좋은 풀이
class Solution {
  public String solution(String phone_number) {
    return phone_number.replaceAll(".(?=.{4})", "*");
  }
}
*/