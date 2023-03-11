걸린 시간 : 20분
레벨 : LV.1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
	
	static ArrayList<Integer> answerList = new ArrayList<>();
	
	public static void permutation(int[] numbers, boolean[] visited, int depth, int[] tmpArray) {
		if (depth == 2) {
			
			int num = tmpArray[0] + tmpArray[1];
			if(!answerList.contains(num)) {
				answerList.add(num);
			}
			return;
		}
		
		for(int i = 0; i < numbers.length; i++) {
			if(visited[i]) {
				visited[i] = false;
				tmpArray[depth] = numbers[i];
				permutation(numbers, visited, depth+1, tmpArray);
				visited[i] = true;
			}
		}
		
	}
	
    public int[] solution(int[] numbers) {
    	
    	
    	boolean[] visited = new boolean[numbers.length];
    	Arrays.fill(visited, true);
    	int[] tmpArray = new int[2];
    	
    	
    	permutation(numbers, visited, 0, tmpArray);
    	
    	int[] answer = new int[answerList.size()];
    	for(int i = 0; i < answerList.size(); i++) {
    		answer[i] = answerList.get(i);
    	}
        
    	Arrays.sort(answer);
    	
        return answer;
    }
}