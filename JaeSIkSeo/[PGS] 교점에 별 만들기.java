package a.PGS;

import java.util.Arrays;
import java.util.HashSet;

public class PGS_교점에별만들기 {
	
	static long minX= Long.MAX_VALUE, 
				minY= Long.MAX_VALUE;
    static long maxX= Long.MIN_VALUE, 
    			maxY= Long.MIN_VALUE;
    
	public class Point {
		long x, y;
		
		public Point (long x, long y) {
			this.x = x;
			this.y = y;
		}
	}
	
	
	public String[] solution(int[][] line) {
        String[] answer = {};
        HashSet<Point> pointSet = new HashSet<>();
        
        // for 문을 돌면서 두 직선들의 교점을 구하고, 구한 교점들을 추가
        long x, y;
        for (int i=0; i<line.length-1; i++) {
        	long a = line[i][0];
        	long b = line[i][1];
        	long e = line[i][2];
        	for(int j=i+1; j<line.length; j++) {
        		long c = line[j][0];
        		long d = line[j][1];
        		long f = line[j][2];
        		
        		long adbc = a*d - b*c;
        		if ( adbc == 0) continue;
        		// 두 직선이 평행하거나 일치할 경우 비교할 필요가 없으니 pass
        	
        		// 두 교점이 정수인지 아닌지 판별하여, 구한 교점 x, y가 모두 정수인 것만 추출
        		long bfed = (b*f - e*d);
        		if ( bfed % adbc != 0 ) continue;
        		// x가 정수가 아닐경우 pass
        			
        		long ecaf = e*c - a*f;
        		if ( ecaf % adbc != 0 ) continue;
        		// y가 정수가 아닐경우 pass
        	
	        	x = bfed / adbc;
	        	y = ecaf / adbc;
	        	pointSet.add(new Point (x,y));
        	
	        	minX= Math.min(minX, x);
                minY= Math.min(minY, y);
                maxX= Math.max(maxX, x);
                maxY= Math.max(maxY, y);
                // 너비와 높이를 구하기위해 최솟값, 최대값을 구한다
        	}
        }
        
        long height = maxY-minY+1;
        long width = maxX-minX+1;
        // 구한 maxx, maxy, minx, miny로 구한 교점들을 넣을 판의 height와 width를 구합니다.
        answer = new String [(int) height];
        // 배열의 크기는 height 만큼
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<width; i++) {
        	sb.append(".");
        }
        Arrays.fill(answer, sb.toString());
        // answer 배열에 모든값을 .으로 채운다
        
        // 교점들을 순회하며 answer에 별을 채운다
        long nx, ny;
        for (Point point : pointSet) {
        	ny = maxY - point.y;
        	nx = point.x - minX;
        	answer[(int)ny] = answer[(int)ny].substring(0,(int)nx)+"*"+answer[(int)ny].substring((int)nx+1);
        }
        
        
        return answer;
    }
	
	

	public static void main(String[] args) {
		
	}

}
