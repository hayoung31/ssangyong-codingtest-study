/*
프로그래머스 가장 가까운 같은 글자

문제 설명
문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
예를 들어, s="banana"라고 할 때,  각 글자들을 왼쪽부터 오른쪽으로 읽어 나가면서 다음과 같이 진행할 수 있습니다.

b는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
a는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
n은 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
a는 자신보다 두 칸 앞에 a가 있습니다. 이는 2로 표현합니다.
n도 자신보다 두 칸 앞에 n이 있습니다. 이는 2로 표현합니다.
a는 자신보다 두 칸, 네 칸 앞에 a가 있습니다. 이 중 가까운 것은 두 칸 앞이고, 이는 2로 표현합니다.
따라서 최종 결과물은 [-1, -1, -1, 2, 2, 2]가 됩니다.

문자열 s이 주어질 때, 위와 같이 정의된 연산을 수행하는 함수 solution을 완성해주세요.

제한사항
1 ≤ s의 길이 ≤ 10,000
s은 영어 소문자로만 이루어져 있습니다.
입출력 예
s	result
"banana"	[-1, -1, -1, 2, 2, 2]
"foobar"	[-1, -1, 1, -1, -1, -1]


 */


class Solution {
    public int[] solution(String s) {
        String[] sArr = s.split("");			// 입력받은 문자열을 배열화 split에 ""를 넣으면
        										// toCharArray처럼 됨. 한문자씩 됨.
        int[] answer = new int[sArr.length];
        boolean bflag = true;					// 변수가 쓰이는 곳은 if문 안이지만 변수 선언은 if문 안에서 불가. 함으로 여기서 선언
        for(int i=0; i<sArr.length; i++) {		// 결과물에 나올 배열값을 하나씩 채워넣는 반복문 시작
            if(i==0) {
                answer[i] = -1;					// 첫인덱스 초기값 선언.
            }
            else
                
                for(int j=0; j<i; j++) {		 // i인덱스 나온 글자가 이전에 나온적이 있는지 확인하는 반복문
                    if(sArr[i].equals(sArr[j])){ // 이전에 동일한 글자가 나왔을 경우
                    	answer[i] = i-j;		 // 해당 인덱스와 이전에 나온 글자 사이의 간격을 계산
                        bflag = false;			 // 처음 나오는 값이 아님을 표시	
                    }
                    else 
                        if(bflag){				 // if문에 적용이 안된 경우 처음 나온 글자
                            answer[i] = -1;
                        }
                }
                bflag = true;

        } // end of for
        
        return answer;
    } // end of public int[] solution(String s)
    
 
    

    /*

1. lastIndexOf 를 이용한 풀이.
     
public static int[] solution(String s) {
	int[] answer = new int[s.length()];
	answer[0] = -1;
	for(int i=1; i<s.length(); i++) {
		int x = s.lastIndexOf(s.substring(i, i+1), i-1);
		if(x != -1) {
			answer[i]= i-x;
		}
		else {
			answer[i] = x;
		}
	}
	return answer;
}     
     
     
2. 제대로 이해 못한 풀이 나중에 다시 볼 것

import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            answer[i] = i-map.getOrDefault(ch,i+1);
            map.put(ch,i);
        }
        return answer;
    }
}

     




     */
}