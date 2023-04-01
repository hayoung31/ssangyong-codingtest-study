package a.PGS;

public class PGS_삼각달팽이 {
	
	public int[] solution(int n) {
        int[] answer = {};
     
//        i +1  0 -1
//        j  0 +1 -1 
//        arr 값이 0인경우 방향전환  	
        int [][] temp = new int [n][n];
        int cnt = 1;
        final int [] dx = {0, 1, -1};
        final int [] dy = {1, 0, -1};
        int x = 0; int y = 0; int dr = 0;
        
        while (true) {
        	temp[y][x] = cnt++;
        	int nx = x + dx[dr];
        	int ny = y + dy[dr];
        	
        	if ( nx == n || ny == n || nx == -1 || ny == -1 || temp[ny][nx] == 0) {
        		dr = (dr+1) % 3;
        		nx = x + dx[dr];
        		ny = y + dy[dr];
        		if ( nx == n || ny == n || nx == -1 || ny == -1 || temp[ny][nx] == 0) break;
        	}
        	x = nx;
        	y = ny;
        }
        
        int index = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<=i; j++) {
				answer[index++] = temp[i][j];
			}
		}
		
		return answer;
	}
        
// ---------------------------------------------------------------------------------------------------        
//        
//		  int [] answer = {};
//        int [][] temp = new int [n][n] ;
//        int cnt = 1;
//        int x = 0, y = 0;
//        
//        while (true) {
//        	while (true) {
//        		temp[y][x] = cnt++;
//        		if (y+1 == n || temp[y+1][x] != 0) break;
//        		y +=1;
//        	}
//        	if (x+1 == n || temp[y][x+1] != 0) break;
//        	x += 1;
//        	
//        	while (true) {
//        		temp[y][x] = cnt++;
//        		if (x+1 == n || temp[y][x+1] != 0) break;
//        		x +=1;	
//        	}
//        	if (temp[y-1][x-1] != 0) break;
//        	x -= 1;
//        	y -= 1;
//        	
//        	while (true) {
//        		temp[y][x] = cnt++;
//        		if (temp[y-1][x-1] != 0) break;
//            	x -= 1;
//            	y -= 1;	
//        	}
//        	if (y+1 == n || temp[y+1][x] != 0) break;
//        	y += 1;
//        }
//        
//        answer = new int [cnt-1];
//        
//        int index = 0;
//        for (int i=0; i<n; i++) {
//        	for (int j=0; j<=i; j++) {
//        		answer[index++] = temp[i][j];
//        	}
//        }
//       
//        return answer;
//    }
	
	
	
	public static void main(String[] args) {
		
	}
}
