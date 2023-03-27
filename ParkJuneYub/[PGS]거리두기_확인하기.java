걸린 시간 : 90분
레벨 : LV.2

import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
	
	public static int[] dx = {-1, 0, 1, 0};
	public static int[] dy = {0, 1, 0, -1};
	public static boolean flag = false;
	
	public static boolean isRange(int x, int y) {
		if(x < 0 || x >= 5 || y < 0 || y >= 5) {
			return false;
		}
		return true;
	}
	
	public static void manhattanDistance(String[] place, int x, int y, int distance, boolean[][] visited) {
		
		for(int i = 0; i < 4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			int afterDistance = distance + 1;
			
			if(isRange(newX, newY) && !visited[newX][newY]) {
				if((afterDistance == 1 || afterDistance == 2) && place[newX].charAt(newY) == 'P') {
					flag = true;
					return;
				}
				
				if((afterDistance == 1) && place[newX].charAt(newY) == 'O') {
					visited[newX][newY] = true;
					manhattanDistance(place, newX, newY, distance+1, visited);
				}
			}
			
		}
	}
	
	public static int checkMap(String[] place) {
		
		
		for(int x = 0; x < 5; x++) {
			for(int y = 0; y < 5; y++) {
				
				if(place[x].charAt(y) == 'P') {
					boolean[][] visited = new boolean[5][5];
					visited[x][y] = true;
					manhattanDistance(place, x, y, 0, visited);
					if(flag) {
						flag = false;
						return 0;
					}
				}
				
			}
		}
		return 1;
	}
	
    public int[] solution(String[][] places) {
        int[] result = new int[5];
    	for(int i = 0; i < 5; i++) {
    		result[i] = checkMap(places[i]);
    	}
    	return result;
    }
}