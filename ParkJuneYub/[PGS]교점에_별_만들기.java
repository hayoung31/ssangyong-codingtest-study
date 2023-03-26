걸린 시간 : --
레벨 : LV.2

import java.util.ArrayList;
import java.util.List;

class Solution {
	
	private static class Point { // 좌표 클래스
		
		public final long x, y; 
		
		private Point(long x, long y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
		double x = (double)(b1*c2 - b2*c1) / (a1*b2 - a2*b1);
		double y = (double)(a2*c1 - a1*c2) / (a1*b2 - a2*b1);
		
		if((x % 1 != 0) || (y % 1 != 0)) {
			return null;
		}
		return new Point((long)x, (long)y);
	}
	
    public String[] solution(int[][] line) {
    	
    	List<Point> points = new ArrayList<>();
    	
    	// 모든 직선 쌍에 대해 반복
    	for(int i = 0; i < line.length; i++) {
    		for(int j = i+1; j <line.length; j++) {
    			Point intersection = intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);
    			
    			// 교점좌표 구하고 정수 좌표만 저장
    			if(intersection != null) {
    				points.add(intersection);
    			}
    		}
    	}
    	
    	
    	// 저장된 정수들에 대해 X, Y 좌표의 최댓값, 최솟값 구하기
    	long maxX = Long.MIN_VALUE;
    	long maxY = Long.MIN_VALUE;
    	long minX = Long.MAX_VALUE;
    	long minY = Long.MAX_VALUE;
    	for(int i = 0; i <points.size(); i++) {
    		maxX = Math.max(maxX, points.get(i).x);
    		minX = Math.min(minX, points.get(i).x);
    		maxY = Math.max(maxY, points.get(i).y);
    		minY = Math.min(minY, points.get(i).y);
    	}
    	
    	// 구한 최댓값 최솟값을 이용하여 2차원 배열의 크기 결정
    	int xLength = (int)(maxX - minX + 1);
    	int yLength = (int)(maxY - minY + 1);
    	
    	char[][] map = new char[yLength][xLength];
    	
    	// 별표시
    	for(int i = 0; i < yLength; i++) {
    		for(int j = 0; j < xLength; j++) {
    			map[i][j] = '.';
    		}
    	}
    	
    	for(int i = 0; i <points.size(); i++) {
            int x = (int)(points.get(i).x - minX);
            int y = (int)(maxY-points.get(i).y);
    		map[y][x] = '*';
    	}
    	
    	
    	
        String[] answer = new String[map.length];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = new String(map[i]);
        }
        
        return answer;
    }
}