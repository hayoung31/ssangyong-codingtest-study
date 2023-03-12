import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	// 필요한 변수 노드개수, 간선 개수, 2차원 그래프, 방문 배열, 큐(링크드리스트)
	public static int VERTICES_NUM;
	public static int EDGES_NUM;
	
	public static ArrayList<Integer>[] graph;
	public static boolean[] visited;
	public static Queue<Integer> q= new LinkedList<>();
	
	// 큐에서 현재 지점을 뽑고 노드개수만큼 그래프의 arrayList를 돌면서 조건이 충족되면 방문표시하고 큐에 넣는다.
	public static void BFS() {
		while(!q.isEmpty()) {
			int currV = q.poll();
			
			for(int i = 0; i < graph[currV].size(); i++) {
				int nextV = graph[currV].get(i);
				if(!visited[nextV]) {
					visited[nextV] = true;
					q.add(nextV);
				}
			}
		}
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		VERTICES_NUM = Integer.parseInt(st.nextToken());
		EDGES_NUM = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[VERTICES_NUM + 1];
		visited = new boolean[VERTICES_NUM + 1];
		
		int[] startPoints = new int[EDGES_NUM + 1];
		int[] endPoints = new int[EDGES_NUM + 1];
		
		// 시작점과 끝 점 받기
		for(int i = 0; i < EDGES_NUM; i++) {
			st = new StringTokenizer(br.readLine());
			startPoints[i] = Integer.parseInt(st.nextToken());
			endPoints[i] = Integer.parseInt(st.nextToken());
		}
		
		// 그래프에 표시하기
		for(int i = 0; i < EDGES_NUM; i++) {
			int start = startPoints[i];
			int end = endPoints[i];
			
			graph[start].add(end);
			graph[end].add(start);
			
		}
		
		int rootVertex = 1;
		visited[rootVertex] = true;
		q.add(rootVertex);
		BFS();

		
	}// end of main(String args[]) -----------------------------
		
	
}      