package study;

import java.util.*;

public class PGS_모의고사 {

	public int[] solution(int[] answers) {
		
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        int[] total = {0,0,0};
        
        // 점수 구하기
        for(int i=0; i<answers.length; i++) {
        	if(answers[i] == num1[i%5]) total[0]++;
        	if(answers[i] == num2[i%8]) total[1]++;
        	if(answers[i] == num3[i%10]) total[2]++;
        	
        }
        
        // 최대점수 구하기
        int max = Math.max(total[0], Math.max(total[1], total[2]));
        
        
        // 최대점수 수포자 리스트 생성
        List<Integer> answ = new ArrayList<Integer>();
        for(int i=0; i<total.length; i++) {
        	if(max == total[i]) answ.add(i+1);
        }
        
        int[] answer = new int[answ.size()];
        for(int i=0; i<answ.size(); i++) {
        	answer[i] = answ.get(i);
        }
    
        return answer;
        
    }
	
	
	
	
	
	
	
	
	
	
}
