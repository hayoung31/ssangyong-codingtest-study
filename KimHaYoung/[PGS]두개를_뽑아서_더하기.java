package study;

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {

       ArrayList list = new ArrayList();
       int temp;
       
       for(int i=0; i<numbers.length-1; i++) {
    	   
    	  for(int j=i+1; j<numbers.length; j++) {
    		 temp = numbers[i] + numbers[j];
    		 list.add(temp);
    	  }//end of for
       }//end of for
       
       HashSet<Integer> hashSet = new HashSet<Integer>(list);  // 헤시셋은 중복값을 저장하지 않는다 따라서 헤쉬셋을 통해 중복제거
       
       List<Integer> list1 = new ArrayList<>(hashSet); // 정렬을 위해 리스트 변환
       
       
       Collections.sort(list1);						// 정렬 완료. arrays.sort 의 collection 버전
       int[] answer = new int[hashSet.size()]; 		// 범위 오류를 피하기 위해 answer의 범위를 지정해줌
       
       for(int i=0; i<list1.size(); i++) {
    	   answer[i] = list1.get(i); 				//for문으로 list를 배열로 변환
    	   											//set.stream().sorted().mapToInt(Integer::intValue).toArray();
    	   											//위에 방식처럼 변환하여도 되는데 오류가 생겨서 포기
       }
      
       
        return answer;
    }
}