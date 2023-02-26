걸린 시간 : 58분
레벨 : LV 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
    	int memberNum = id_list.length;
    	int[] answer = new int[memberNum];
    	int[][] map = new int[memberNum][memberNum];
    	boolean[][] visited = new boolean[memberNum][memberNum];
    	
    	for(int i = 0; i < report.length; i++) {
    		String[] line = report[i].split(" ");
    		String reportingUser = line[0];
    		String reportedUser = line[1];
    		
    		int x = getIndex(reportingUser, id_list);
    		int y = getIndex(reportedUser, id_list);
    		
    		if(visited[x][y] = true) {
        		visited[x][y] = false;
        		map[x][y] = 1;
    		}

    	}
    	
    	
    	for(int y = 0; y < memberNum; y++) {           // 신고한 사람은 x축 신고당한 사람은 y축이므로 y축을 기준으로 합이 k보다 큰 경우 
    												   //	x축 idx에게 정지 먹였다고 메일 보냅니다.
    		int sum = 0;
    		for(int x = 0; x < memberNum; x++) {
    			sum += map[x][y];
    		}
    		if(sum >= k) {
        		for(int x = 0; x < memberNum; x++) {
        			if(map[x][y] == 1) {
        				answer[x]++;
        			}
        		}
    		}
    	}
    	
    	return answer;
    	
    }
    
    public int getIndex(String name, String[] id_list) {
    	int idx = 0;
    	for(int i = 0; i < id_list.length; i++) {
    		if(name.equals(id_list[i])) {
    			idx = i;
    		}
    	}
    	return idx;
    }
    
}