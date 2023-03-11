import java.util.Scanner;

public class Main {
	
	static int N;
	static int[][] map;
	static boolean[] visit;
	
	static int Min = Integer.MAX_VALUE;
	//정수의 최대값을 만들기위해서 MAX_VALUE를 사용한다
	// 차이가 음수로 나오도 정수로 보이기 위해서이다
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//인원수 받기 
		N = sc.nextInt();
		
		map = new int[N][N];
		visit = new boolean[N];
		
		// 받은 정수로 능력치 map을 생성 
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		// 팀구성 메소드 호출
		teamForm(0, 0);
		//최솟값을 찾는 함수 호출 
		System.out.println(Min);
	
	}
	// 팀을 구성하는 메소드
	static void teamForm(int at, int depth) {
	    // 팀 구성의 예시 (12,34 or 13,24 or 14,23) 
		if(depth == N/2) {
			// 팀구성을 마치면 팀의 능력차이를 구하는 메소드 호출
			findMin();
			return;
		}
	    for(int i=at; i<N; i++) {
	    	if(!visit[i]) {
	    		visit[i] = true;
	    		teamForm(i+1, depth+1);
	    		visit[i] = false;
	    }
	}// end of teamForm()
    }
   //최소값을 찾는 메소드
	static void findMin(){
		int start_team = 0;
		int link_team = 0;
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(visit[i] == true && visit[j] == true) {
					start_team += map[i][j];
					start_team += map[j][i];
				}
				else if(visit[i] == false && visit[j] == false){
					link_team += map[i][j];
					link_team += map[j][i];
					
				}
			}
		
		}// end of for
		
		// 차이 구하기
		int dif = Math.abs(start_team - link_team);
		
		if(dif == 0) {
			System.out.println(dif);
			System.exit(0);
		}
		
		Min = Math.min(dif,Min);
	}// end of findMin
}
