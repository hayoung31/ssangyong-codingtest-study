걸린 시간 : 120분
레벨 : LV2

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public static int[][] arr;
	public static int cnt;
	
	public static boolean isRange(int x, int y, int n) {
		if(x < 0 || x >= n || y < 0 || y >= n) {
			return false;
		}
		return true;
	}
	
	// 아래로 채우는 경우, 오른쪽으로 채우는 경우, 왼쪽 위로 채우는 경우
	public static void fillArray(int n) {
		int x = 0;
		int y = 0;
		cnt = 1;
		arr[x][y] = 1;
		
		boolean roundFirst = false;
		while(true) {
			
			int benchmark = cnt;
			
			while(isRange(x+1, y, n) && isNumberZero(x+1, y)) {
				arr[x+1][y] = cnt+1;
				x++;
				cnt++;
			}
			
			if(roundFirst && (y+1 == n-1)) {
				break;
			}
			
			while(isRange(x, y+1, n) && isNumberZero(x, y+1)) {
				arr[x][y+1] = cnt+1;
				y++;
				cnt++;
			}
			while(isRange(x-1, y-1, n) && isNumberZero(x-1, y-1)) {
				arr[x-1][y-1] = cnt+1;
				x--;
				y--;
				cnt++;
			}
			
			roundFirst = true;
			
			if(cnt == benchmark) {
				break;
			}
		}
		
	}
	
	public static boolean isNumberZero(int x, int y) {
		if(arr[x][y] == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
    public int[] solution(int n) {
        
        
        // n*n 2차원배열 선언
        // 숫자를 채울 현재 위치를 (0, 0)으로 설정
        // 방향에 따라 이동할 수 없을 때까지 반복하면서 숫자 채우기
        
        arr = new int[n][n];
        
        
        fillArray(n);
        int[] answer = new int[cnt];
        int idx = 0;
        
        for(int x = 0; x < n; x++) {
        	
        	for(int y = 0; y < n; y++) {
        		
        		if(arr[x][y] != 0) {
        			answer[idx] =  arr[x][y];
        			idx++;
        		}
        	}
        }
        
        return answer;
    }
}