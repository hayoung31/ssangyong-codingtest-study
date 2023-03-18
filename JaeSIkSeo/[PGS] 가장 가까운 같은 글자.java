package a.PGS;

import java.util.Arrays;

public class PGS_가장가까운같은글자 {

	public int[] solution(String s) {
        int[] answer = new int [s.length()];
        Arrays.fill(answer, -1);								     // 정답배열 -1로 초기화
        char[] temp = s.toCharArray();
        
        // [ b, a, n, a, n, a]
        for (int i=0; i<temp.length; i++) {
        	for (int j=0; j<temp.length; j++) {                      // i와 j는 같은 배열의 인덱스를 가르키므로
        		if ( (temp[i] == temp[j]) && (i != j) && (j < i) ) { // 조건은 문자는 같고 인덱스번호는 다를때
					if (answer[i] > 0) {							 // 중복된 것을 찾으면 다시 값을 초기화
						answer[i] = -1;
					}
        			answer[i] += i - j +1 ;  						 // -1로 초기화를 해주었으므로 +1을 해야함.
        		}
        	}
        }
        return answer;
    }
 
}
