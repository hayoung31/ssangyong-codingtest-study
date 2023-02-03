걸린 시간 : 45분
레벨 : 실버 2


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {

	
	public static int v;
	public static int e;
	public static int[][] graph;
	public static int[] visited;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		y7yyyyyy
		v = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		int startNode = Integer.parseInt(st.nextToken());
		
		// 2차원 배열로 그래프 만들기, 노드의 번호는 인덱스 번호와 같으므로 임의로 1칸을 늘린다.
		graph = new int[v+1][v+1];
		visited = new int[v+1];
		
		int row;
		int col;
		
		for(int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			row = Integer.parseInt(st.nextToken());
			col = Integer.parseInt(st.nextToken());
			
			graph[row][col] = 1;
			graph[col][row] = 1;
		}
		
		dfs(startNode);
		System.out.println("");
		
		Queue<Integer> queue = new LinkedList<Integer>();
		visited = new int[v+1];
		
		queue.offer(startNode);
		visited[startNode] = 1; 
		
		while(!queue.isEmpty()) { // queue에 객체를 집어넣는 메서드 offer, add
			
			int node = queue.poll();
			
			System.out.print(node + " "); // 큐에서 뽑아낸 노드는 출력
			
			for(int i = 1; i < v+1; i++) {
				if(graph[node][i] == 1 && visited[i] != 1) {	// 간선이 연결되어 있어야 하며, 방문 표시가 없어야 함
					
					queue.offer(i);                            // 뽑아낸 노드와 연결된 노드들은 큐에 넣는다.
					visited[i] = 1;   					// 방문할꺼라 표시
				}
			}
		}
		
	}
	
	public static void dfs(int node) {
		
		// 방문했다고 표시하기
		System.out.print(node + " ");
		visited[node] = 1;
		
		// 방문 노드 찾기
		for(int i = 1; i < v+1; i++) {
			if(graph[node][i] == 1 && visited[i] != 1) {
				dfs(i);
			}
		}
	}
	
}