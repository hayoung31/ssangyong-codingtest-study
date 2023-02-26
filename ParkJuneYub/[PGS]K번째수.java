걸린 시간 : 5분
레벨 : LV 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
    	int[] answer = new int[commands.length];
    	
    	
    	for(int m = 0; m < commands.length; m++) {
    		int i = commands[m][0]; 
    		int j = commands[m][1]; 
    		int k = commands[m][2]; 
    		
    		int[] arr = Arrays.copyOfRange(array, i-1, j);
    		
    		Arrays.sort(arr);
    		
    		answer[m] = arr[k-1];
    	}
    	
        
        return answer;
    }
}