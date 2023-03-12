import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
    /* #1 나의풀이
    	//받은수만큼 답배열의 길이를 지정 
    	//나올수있는 답변의 길이
       int[] answer = new int [commands.length];
       
       //1차배열의 수만큼 for문을 돌림
        for(int i=0; i<commands.length; i++){
        	//가공된 배열을 넣을 리스트를 생성
            ArrayList<Integer> list = new ArrayList<>();
            
            int first = commands[i][0]; //시작값
            int end = commands[i][1];  //끝값
            int index = commands[i][2]; //답이될 인덱스의 수
            // 배열의시작과 끝값을 자른 배열수 만큼 생성된 리스트에 더해줌
            for(int j = first-1; j<=end-1; j++){
               list.add(array[j]);   
            }
            //리스트를 오름차순으로 정렬
            Collections.sort(list);
            //정렬후 n-1번째 수 호출 
            answer[i] = list.get(index-1);
        }
        //정답을 리턴 
        return answer;
        */
    	//#2 다른풀이
    	
    	int[] answer = new int[commands.length];
    	
    	for(int i=0; i<commends.length; i++) {
    		int[] temp = Array.copyOfRange(array,commands[i][0]-1,commands[i][1]);
    		Arrays.sort(temp);
    		answer[i] = temp[commands[i][2]-1]
    				
    	}		
    }
  	
    
}

/*
 * 
 * - copyOfRange(arr, n1, n2) : 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환함

 - 첫 번째 매개변수로 복사의 대상이 될 원본 배열(arr)을 전달 받음.

 - 두 번째 매개변수로는 원본 배열에서 복사할 시작 인덱스를 전달받고, 세 번째 매개변수로는 마지막으로 복사될 배열 요소의 바로 다음 인덱스를 전달 받음

 - 즉, 세 번째 매개변수로 전달된 인덱스 바로 전의 배열 요소까지만 복사됨. 그리고 원본 배열과 같은 타입의 복사된 새로운 배열을 반환함.
 */
*/