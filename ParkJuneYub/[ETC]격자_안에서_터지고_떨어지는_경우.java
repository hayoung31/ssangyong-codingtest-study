걸린 시간 : 23분
레벨 : 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;



public class Main {
	
	public static int remainder = 0;
	
	public static int[] deleteBlock(int[] blockList, int s, int e) {
		int len = remainder - (e - s + 1);
		int[] tmp = new int[len];
		
		for(int i = s-1; i < e; i++) {
			blockList[i] = 0;
		}
		
		int idx = 0;
		for(int i = 0; i < blockList.length; i++) {
			if(blockList[i] != 0) {
				tmp[idx] = blockList[i];
				idx++;
			}
		}
		
		int[] returnList = new int[blockList.length];
		
		for(int i = 0; i < tmp.length; i++) {
			returnList[i] = tmp[i]; 
		}
		remainder = tmp.length;
		return returnList;
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		remainder = n;
		int[] blockList = new int[n];
		for(int i = 0; i < n; i++) {
			blockList[i] = Integer.parseInt(br.readLine());
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s1 = Integer.parseInt(st.nextToken());
		int e1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int s2 = Integer.parseInt(st.nextToken());
		int e2 = Integer.parseInt(st.nextToken());
		
		blockList = deleteBlock(blockList, s1, e1);
		blockList = deleteBlock(blockList, s2, e2);
		
		System.out.println(remainder);
		
		if(remainder != 0) {
			for(int i = 0; i < remainder; i++) {
				System.out.println(blockList[i]);
			}
		}

		
	}// end of main(String args[]) -----------------------------
		
	
}