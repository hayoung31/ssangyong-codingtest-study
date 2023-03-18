package a.BOJ;

import java.util.Scanner;

public class BOJ_1316 {

	public static void main(String[] args) {
		
		// ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만
		// aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

		Scanner sc = new Scanner (System.in);
		int num = Integer.parseInt(sc.nextLine());
		int count = 0;
		String str = "";
		String temp1 = "";		// temp1과 temp2를 비교해 조건이 맞으면 그룹함수이다.
		String temp2 = "";
	
		for (int i=0; i<num; i++) { // 한개씩 검사하여 count 증가
		
			str = sc.nextLine();			 // 키포인트는 순서대로 나온 중복을 제거했을때 떨어져 있는 중복된 문자가 나왔는지 판별
			temp1 = "";
			temp2 = "";
			
			for (int j=0; j<str.length(); j++) {
				
				if ( str.indexOf( str.charAt(j) ) == j ) { // 순서대로 문자가 그 글자에 하나만 나왔을경우 문자를 추출해 answer에 담음 
					temp1 += str.charAt(j);			 	   // 떨어져있는 중복문자를 제외하고 그룹단어인 것을 추출
				}	// a a b b b c c b
					// a b c 출력
				
				if (j < str.length()-1) {  // 마지막 인덱스일 경우 j+1값을 못쓰니 마지막은 포함되어있는지만 확인
					if (str.charAt(j) != str.charAt(j+1) ) { // 해당문자가 다음문자와 같지않으면 result에 추가
						temp2 += str.charAt(j);  
					} // 순서대로 중복을 제거하되 떨어져있는 중복문자를 포함해 출력
					  // a a b b b c c b
					  // a b c b 출력
				}
				else {
					if (str.contains( String.valueOf(str.charAt(j)))) {
						temp2 += str.charAt(j);
					}
				}
			}
			System.out.println(temp1);
			System.out.println(temp2);
			if (temp1.equals(temp2)) { // answer와 result의 담긴것을 비교해 같으면 그룹단어이므로 count 증가
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
