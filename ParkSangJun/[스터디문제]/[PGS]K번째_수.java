import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
       int[]answer = new int[commands.length];// 예제에서 3개의 답을 내놔야하니까 commands길이
		int n = 0;//추후에 answer배열 순서를 위한 값
		
		for(int i=0; i<commands.length; i++) {
			int k =0;
			
			int[]list = new int [commands[i][1]-commands[i][0]+1]; 
			
			for(int j=commands[i][0]; j<=commands[i][1]; j++) {
				list[k++] = array[j - 1];// 왜 1을 빼나? 배열은 0부터 시작하기때문!// k=0부터 1씩 증가, list 배열값을 넣기위한 부분
				//ex list[0] = array[2-1]				
				
			}//end of for j
			Arrays.sort(list);
			answer[n++] = list[commands[i][2] -1];// answer 배열값은 list 배열에서 commands[i][2] 번째 출력
		}//end of for i
        return answer;
    }
}