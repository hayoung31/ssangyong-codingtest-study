걸린 시간 : 42분
레벨 : 브론즈 2


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
	
	public static int[] arr;
	
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		int lowOfRight = partition(arr, low, high);		// 배열의 가운데 값인 피봇을 기준으로 피봇의 인덱스를 가져온다. 
		if(low < lowOfRight - 1) {			// 만약 로우가 피봇-1보다 작다면
			quickSort(arr, low, lowOfRight - 1);  // 왼쪽 정렬 시작
		}
		if(lowOfRight - 1 < high) {		// 만약 하이가 피봇-1다 크다면
			quickSort(arr, lowOfRight, high); // 피봇 오른쪽 부분 정렬 시작
		}
	}
	
	public static int partition(int[] arr, int low, int high) {		// 피봇을 기준으로 => [작은 부분] [피봇, 피봇보다 큰 부분] 으로 구분하고 피봇보다 큰 그룹의 가장 첫번째 값 즉 피봇의 위치를 리턴한다.
		// 피봇은 low이다.
		int pivot = arr[(low + high) / 2];

		while(low <= high) {
			while(arr[low] < pivot) {
				low++;
			}
			
			while(arr[high] > pivot) {
				high--;
			}
			
			if(low <= high) {
				swap(arr, low, high);
				low++;
				high--;
				}
			}
		return low;
		}
	
	public static void swap(int[] arr, int low, int high) {
		int tmp = arr[low];
		arr[low] = arr[high];
		arr[high] = tmp;
	}
	


	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
 		for(int i = 0; i < n; i++) {
 			arr[i] = Integer.parseInt(br.readLine());
 		}
 		
 		quickSort(arr);
 		
 		for(int i = 0; i < n; i++) {
 			System.out.println(arr[i]);
 		}
		
	}// end of main(String args[]) -----------------------------
		
	
}      