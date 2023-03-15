
/*처음 생각 
받은 문자열을 charat 해서 베열에 이중 for 을 돌려서
처음 인덱스에서 b 를 두번째 배열에서 찾아
그런다음에 그 글자가 없으면 -1 을
answer에 push 해주고
있다면 찾은 인덱스를  push해준다 
*/
/*
lastindexOf() 는 특정 문자나 문자열이 뒤에서부터 처음 발견되는 인덱스를 반환하며
만약 찾지 못했을 경우 "-1"을 반환합니다.
 */

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        for(int i=1; i <s.length(); i++) {
            int num = s.lastIndexOf(s.substring(i, i+1) ,i-1);

            if(num != -1) {
               answer[i] = i-num;
            }
            else {
                answer[i] = num;
            }
        }
        return answer;
    }
}

	

		 