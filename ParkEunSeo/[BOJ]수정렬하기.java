package study;

import java.util.Scanner;

public class BOJ_2750 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		int temp;
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();					
			
		}// end of for(int i=0; i<a.length; i++)------------
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}// end of for(int i=0; i<n; i++)-------------------
				
		
		for(Integer i:arr) {
			
			System.out.println(i);
			
		}// end of for(Integer i:a) -------------

	}

}
