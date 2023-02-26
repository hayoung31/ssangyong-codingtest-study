package a.PGS;

import java.util.HashMap;
import java.util.HashSet;

public class PGS_신고결과받기 {
	
	public static int[] solution(String[] id_list, String[] report, int k) {
        
        // key (id)는 고유하지만 value (다른사람은 신고는 중복이 가능하기 때문에)은 중복이 가능하기 때문에
     	// Map으로 구현 단, value 값은 같은것은 허용이 안되기때문에 Set으로 구현
        // 이렇게 구현하면 객체 자체가 조건을 만족하기 때문에 같은사람을 신고하는 중복조건이나 다른조건을 기술할 필요가 없음. 
     	
		HashMap<String, HashSet<String>> reportMap = new HashMap<>();
		HashMap<String, HashSet<String>> resultMap = new HashMap<>();
	

		for (String r : report) {
			String [] str = r.split(" "); // 신고자와 신고당한자를 나눠서 temp에 저장 [0]은 신고자 [1]은 신고당한자 
			if (reportMap.containsKey(str[0]) == false) {
				reportMap.put(str[0], new HashSet<>()); // String 값을 넣어야 하기때문에 hash 객체생성
			}
			reportMap.get(str[0]).add(str[1]); // 신고당한자 값을 추가
			
			if (resultMap.containsKey(str[1]) ==false ) { // results는 반대로
				resultMap.put(str[1], new HashSet<>());
			}
			resultMap.get(str[1]).add(str[0]);
		}
		
		
		int[] answer = new int [id_list.length];
		
		for (int i=0; i<id_list.length; i++) {
			
			String user = id_list[i];
			if (reportMap.containsKey(user) == false) { // 신고안한유저는 무시
				continue;
			}
			for (String bad : reportMap.get(user)) {
				if (resultMap.get(bad).size() >= k) {
					answer[i]++;
				}
			}
			
		}
		
         return answer;
    }

	public static void main(String[] args) {
		String [] test = {"muzi", "frodo", "apeach", "neo"};
		String [] test1 = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		solution( test , test1, 2 );
	
	}

}
