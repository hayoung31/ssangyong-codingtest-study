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
	
	public static int[][] graph;
	public static boolean[] visited;
	
	public static int ans = 0;
	
	public static void DFS(int vertex) {
		for(int currV = 1; currV <= VERTICES_NUM; currV++) {
			if(graph[vertex][currV] == 1 && !visited[currV]) {
				ans++;
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
		
		graph = new int[VERTICES_NUM+1][VERTICES_NUM+1];
		visited = new boolean[VERTICES_NUM + 1];
		
		
		
		int[] startPoints = new int[EDGES_NUM];
		int[] endPoints = new int[EDGES_NUM];
		
		for(int i = 0; i < EDGES_NUM; i++) {
			st = new StringTokenizer(br.readLine());
			startPoints[i] = Integer.parseInt(st.nextToken());
			endPoints[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < EDGES_NUM; i++) {
			int start = startPoints[i];
			int end = endPoints[i];
			
			graph[start][end] = 1;
			graph[end][start] = 1;
		}
		
		int rootVertex = 1;
		visited[rootVertex] = true;
		DFS(rootVertex);
		
		System.out.println(ans);


		
	}// end of main(String args[]) -----------------------------
		
	
}      