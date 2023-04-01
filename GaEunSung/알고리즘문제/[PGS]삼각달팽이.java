class Solution {
    public int[] solution(int n) {
        int[] answer =  new int[n*(n+1)/2];
        int [][]triangle = new int[n][n];
        
        // 시작위치 x가 왜 -1시작하는지 모호하게 이해 
        int x = -1,y=0; 
        int num = 1;
        
        for(int i=0; i<n; i++) {
        	for(int j=i; j<n; j++) {// 아래로 
        		if(i%3 == 0) {
        			++x; // 바로 증가 
        		}
        		else if(i%3 == 1) {// 오른쪽으로
        			++y;
        		}
        		else if(i%3 == 2) {//대각선 위로
        			--x;
        			--y;
        		}
        		triangle[x][y]= num++;
        	}
        }
        int idx = 0;
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		if(triangle[i][j] == 0) break;
        		answer[idx++]= triangle[i][j];
        	}
        }

        return answer;

    }
}

// 삼각형의 면적 구하기 문제 
// int [] answer = new int[n*(n+1)/2];
//X++ executes the statement and then increments the value. 
//++x increments the value and then executes the statement.