import java.util.Scanner;

//문제
//
//1부터 N까지의 수로 이루어진 순열이 있다. 이때, 사전순으로 바로 이전에 오는 순열을 구하는 프로그램을 작성하시오.
//
//사전 순으로 가장 앞서는 순열은 오름차순으로 이루어진 순열이고, 가장 마지막에 오는 순열은 내림차순으로 이루어진 순열이다.
//
//N = 3인 경우에 사전순으로 순열을 나열하면 다음과 같다.
//
//1, 2, 3
//1, 3, 2
//2, 1, 3
//2, 3, 1
//3, 1, 2
//3, 2, 1
//
//입력
//첫째 줄에 N(1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄에 순열이 주어진다.
//
//출력
//첫째 줄에 입력으로 주어진 순열의 이전에 오는 순열을 출력한다. 만약, 사전순으로 가장 처음에 오는 순열인 경우에는 -1을 출력한다.

public class BOJ_10973 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
	
		
		if(prePermutaion(arr)) {
			for(int i : arr)
				System.out.print(i + " ");
		} else {
			System.out.println(-1);
		}
		sc.close();
	}
	
	public static boolean prePermutaion(int[] arr) {
		int i = arr.length-1;
		
		while(i > 0 && arr[i] > arr[i-1]) { // 다음순열일 경우 부등호 반대로
			i--;
		}

		if(i == 0) //첫 번째 순열인 경우
			return false;
		
		int j = arr.length-1;
		while(arr[i-1] < arr[j]) { // 다음순열일 경우 부등호 반대로
			j--;
		}
		swap(arr, i-1, j);
		
		j = arr.length-1;
		while(i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
		
		return true;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
