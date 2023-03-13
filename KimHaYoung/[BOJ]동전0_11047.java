/*
백준 동전 0 - 11047번 그리디 알고리즘을 활용하는 문제

문제
준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.

동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

출력
첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다. 
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 	// 숫자밖에 없으니 개행문자 처리 상관 없이 nextInt로 받으면됨
		int K = sc.nextInt();
		
		int[] coin = new int[N]; // N 값만큼의 동전종류 N의 크기를 가지는 배열 생성
		
		for(int i = N-1; i >= 0; i--) { //동전의 종류는 값이 작은 것부터 주고 있음.
										//아래 확장 포문에서 그리디알고리즘을 쓸건데 
										//가장큰 값의 동전부터 줄여나가야함 
										//그런데 가장 작은 동전부터 입력받으니
										//배열의 데이터값들이 내림차순을 가질 수 있도록 for문을 설정(입력받은 낮은 값부터 뒤에서부터 채워오도록)
			coin[i] = sc.nextInt();	
		}
	    int cnt = 0; // 총 동전 갯수
		
	    for (int coins : coin){
	    	if(coins <= K) {		//
		        cnt += (K/coins);	// 금액을 큰 동전부터 깎아내려감 K를 나눈 몫이 사용가능한 해당 값의 동전이 최대로 쓰일 수 있는 갯수
		        K %= coins;			// 위에서 몫은 다 하고 남은 나머지를 다시 K값에 대입 그리고 과정을 반복
	    	}    
	    }
		
		System.out.println(cnt);
	}


}

// 그리디 알고리즘에 대한 설명 https://jellili.tistory.com/23
// 