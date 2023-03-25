import java.util.*;

// 좌표를 표현 
	public class Solution {
		 // x y 구하기 
		  private static class Point {
		        public final long x, y;

		        private Point(long x, long y) {
		            this.x = x;
		            this.y = y;
		        }
		    }
		
		// 교점 좌표구하기 
    	private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2 ) {
    		double x =(double)(b1*c2 - b2*c1)/(a1*b2 - a2*b1);
    		double y = (double)(a2*c1 - a1*c2)/(a1*b2 - a2*b1);
    		
    		if(x%1 != 0 || y%1 != 0) { // 나머지가 발생하면 실수// 실수리면 NULL을 RETURN
    			return null;
    		}
    		 return new Point((long)x ,(long)y);
    		
    	}// end of private Point intersaction
    	
    	private Point getMinPoint(List<Point> points) {
    		long x = Long.MAX_VALUE;
    		long y = Long.MAX_VALUE;
    		
    		for(Point p : points) {
    			if(p.x < x) {
    				x = p.x;
    			}
    			if(p.y < y) {
    				y = p.y;
    			}
    		    			
    		}
    		return new Point(x, y);
    	}// end of private Point getMinPoint(List<Point> points)
    	
    	private Point getMaxPoint(List<Point> points) {
    		long x = Long.MIN_VALUE;
    		long y = Long.MIN_VALUE;
    		
    		for(Point p : points) {
    			if(p.x > x) {
    				x = p.x;
    			}
    			if(p.y > y) {
    				y = p.y;
    			}
	
    		}
    		return new Point(x, y);
    	}// end of private Point getMinPoint(List<Point> points)
		public String[] solution(int[][] line) {

			List<Point> points = new ArrayList<>();
			
	    	// 모든 직선의 쌍에 대한 반복(두직선을 PICK)
	    	for (int i=0; i<line.length-1; i++) {
	    		for(int j=i+1; j<line.length; j++) {
	    			Point intersection = intersection(line[i][0],line[i][1],line[i][2],
	    					                          line[j][0],line[j][1],line[j][2]);
	    			if (intersection != null) {
	    				points.add(intersection);
	    			}
	    		}
	    	}// end of for 
	    	
	    	Point minium = getMinPoint(points);
	    	Point maximum = getMaxPoint(points);
	    	
	    	int width = (int)(maximum.x - minium.x + 1);
	    	int height = (int)(maximum.y - minium.y + 1);
	    	
	    	char[][]arr = new char[height][width];
	    	for(char[]row : arr) {
	    		Arrays.fill(row, '.');
	    	}
	    	
	    	for(Point p:points) {
	    		int x = (int)(p.x - minium.x);
	    		int y = (int)(maximum.y - p.y);
	    		arr[y][x] = '*';
	    	}
	    	
	    	String[] result = new String[arr.length];
	    	for(int i=0; i<result.length; i++) {
	    		result[i] = new String(arr[i]);
	    	}
	    	
	    	return result;
		
	    }// end of public String[] solution(int[][] line)
    }// end of Solution()