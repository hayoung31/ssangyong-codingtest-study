걸린 시간 : 12분
레벨 : LV 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public int[] solution(int[] answers) {
        
    	int[] supoja1 = {1,2,3,4,5};
    	int[] supoja2 = {2,1,2,3,2,4,2,5};
    	int[] supoja3 = {3,3,1,1,2,2,4,4,5,5};
    	
		int supoja1Ans = 0;
		int supoja2Ans = 0;
		int supoja3Ans = 0;
		
    	
    	for(int i = 0; i < answers.length; i++) {

    		if(answers[i] == supoja1[i % 5]) {
    			supoja1Ans++;
    		}
    		
    		if(answers[i] == supoja2[i % 8]) {
    			supoja2Ans++;
    		}
    		
    		if(answers[i] == supoja3[i % 10]) {
    			supoja3Ans++;
    		}
    	}
    	
    	int maxNum = Math.max(supoja1Ans, Math.max(supoja2Ans, supoja3Ans));
    	
    	int[] check = new int[3];
    	int answerNum = 0;
    	
    	if(maxNum == supoja1Ans) check[0] = 1;
    	if(maxNum == supoja2Ans) check[1] = 1;
    	if(maxNum == supoja3Ans) check[2] = 1;
    	for(int i = 0; i < 3; i++) {
    		if(check[i] == 1) {
    			answerNum++;
    		}
    	}
    	
    	int[] answer = new int[answerNum];
    	int inputNum = 0;
    	
    	if(maxNum == supoja1Ans) {
            answer[inputNum] = 1;
            inputNum++;
        }
    	if(maxNum == supoja2Ans) {
            answer[inputNum] = 2;
            inputNum++;
        }
    	if(maxNum == supoja3Ans) {
            answer[inputNum] = 3;
            inputNum++;
        }
  
    	return answer;	
    }
}
 