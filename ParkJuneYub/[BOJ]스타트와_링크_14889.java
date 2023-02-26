걸린 시간 : 60분
레벨 : 실버 2

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	// 접근 방법
	// 1. 순열에서 조합을 이용해 풀었다. 조합 : 순서에 상관없이 중복되지 않게 뽑아야 한다. (다 뽑아버리면 시간초과 걸린다.)
	// 2. 조합으로 이용해서 뽑을 때는 startNum을 활용해 앞에서 뽑은 수는 제외하면서 순서에 상관없이 중복되지 않게끔 한다.
	// 3. depth 가 팀 수에 도달했을때 visited 배열을 활용해 팀 B의 인원들도 정의한다.
	// 4. 이후에 팀A의 합과 팀B의 합을 구한다.
	
	static int n, teamMemberNum;
	static int[][] arr;
	static int teamStatGap = Integer.MAX_VALUE;
	
	
	public static void combination(int depth, int[] teamA, boolean[] visited, int startNum) {
		
		if(depth == teamMemberNum) {
			ArrayList<Integer> teamB = new ArrayList<Integer>();
			int teamASum = 0;
			int teamBSum = 0;
			
			for(int i = 0; i < visited.length; i++) {
				if(visited[i]) {
					teamB.add(i+1);
				}
			}
			
			for(int i = 0; i < teamMemberNum; i++) {
				for(int j = 0; j < teamMemberNum; j++) {
					teamASum += arr[teamA[i]-1][teamA[j]-1];
					teamBSum += arr[teamB.get(i)-1][teamB.get(j)-1];
				}
			}
			teamStatGap = Math.min(Math.abs(teamASum-teamBSum), teamStatGap);
			
			return;
		}
		
		
		for(int i = startNum; i < n; i++) {
			if(visited[i]) {
				visited[i] = false;
				teamA[depth] = i+1;
				combination(depth+1, teamA, visited, startNum);
				visited[i] = true;
			}
			startNum++;
		}
		
		
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		teamMemberNum = n/2;
		
		boolean[] visited = new boolean[n];
		Arrays.fill(visited, true);
		int[] teamA = new int[n]; 
		arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		combination(0, teamA, visited, 0);
		
		System.out.println(teamStatGap);

		
	}// end of main(String args[]) -----------------------------
		
	
}      

