import java.util.*;
class Solution {
	    public int[] solution(int[] answers) {
	    	int[] answer = {};
	        int[] mem1 = {1,2,3,4,5};
	        int[] mem2 = {2,1,2,3,2,4,2,5};
	        int[] mem3 = {3,3,1,1,2,2,4,4,5,5};
	        int[] count = {0,0,0};

	        for(int i=0; i<answers.length; i++) {
	        	if(answers[i] == mem1[i%5]){count[0]++;}
	        	if(answers[i] == mem2[i%8]) {count[1]++;}
	        	if(answers[i] == mem3[i%10]) {count[2]++;}

	        }

	       
	        int max = Math.max( Math.max(count[1],count[2]),count[0]);
	        
	       
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        if(max==count[0]) list.add(1); 
            if(max==count[1]) list.add(2);
            if(max==count[2]) list.add(3);

	        
	        answer = new int[list.size()];
	        
	        for(int i=0; i<list.size(); i++){
	            answer[i] = list.get(i);
	        }
	        
	        return answer;
	    
        }
}