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
	
	public static int VERTICES_NUM;
	public static int EDGES_NUM;
	
	public static ArrayList<Integer>[] graph;                                        // 리스트로 구성된 배열 선언
	public static boolean[] visited;
	
	public static int ans = 0;
	
	public static void DFS(int vertex) {
		for(int i = 0; i < graph[vertex].size(); i++) {
			int currV = graph[vertex].get(i);
			if(!visited[currV]) {
				visited[currV] = true;
				DFS(currV);
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
		
		for(int i = 0; i < EDGES_NUM; i++) {								// 그래프 배열에 각각 리스트를 추가한다.
			graph[i] = new ArrayList<>();
		}
		
		int[] startPoints = new int[EDGES_NUM];								// 간선을 연결하기 위해 시작점과 끝 점 배열을 만든다.
		int[] endPoints = new int[EDGES_NUM];
		
		for(int i = 0; i < EDGES_NUM; i++) {
			st = new StringTokenizer(br.readLine());
			startPoints[i] = Integer.parseInt(st.nextToken());
			endPoints[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < EDGES_NUM; i++) {
			int start = startPoints[i];
			int end = endPoints[i];
			
			graph[start].add(end);											// 양방향 간선이라면 시작노드와 끝 노드 모드에 간선 추가
			graph[end].add(start);
		}
		
		int rootVertex = 1;													// 루트 노드부터 DFS를 시작한다.
		visited[rootVertex] = true;
		DFS(rootVertex);
		
		System.out.println(ans);


		
	}// end of main(String args[]) -----------------------------