package a.PGS;

import java.util.Arrays;

public class ex_4 {
//	배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//
//	예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
//
//	array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//	1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//	2에서 나온 배열의 3번째 숫자는 5입니다.
//	배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//
//	제한사항
//	array의 길이는 1 이상 100 이하입니다.
//	array의 각 원소는 1 이상 100 이하입니다.
//	commands의 길이는 1 이상 50 이하입니다.
//	commands의 각 원소는 길이가 3입니다.
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int [commands.length]; // 길이를 임의로 50으로 설정했더니 오답으로 나와서 딱맞게 설정했습니다 
        int first, second, third;

    	for (int i=0; i<commands.length; i++) { // 3개의 원소를 commands 길이만큼 반복
    		first = commands[i][0];    // 2차적인 배열들을 각각의 변수로 지정
    		second = commands[i][1];
    		third = commands[i][2];
    		
    		int [] temp = Arrays.copyOfRange(array, first-1, second);
    		// array 배열을 first-1 부터 second 까지의 배열을 temp에 복사하는 메소드
    		// first를 포함해야하므로 -1을 줌
    		
    		Arrays.sort(temp); // 이것을 정렬하고
    		answer[i] = temp[third-1]; // k번째 오는 값을 answer에 담는다 
    		// temp 의 인덱스 번호를 가져와야 하므로 -1
    	}
        
        return answer;
    }
	public static void main(String[] args) {
		
	}

}
