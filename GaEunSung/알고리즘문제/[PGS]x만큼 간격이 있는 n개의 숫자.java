class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<n; i++){
            answer[i]=(long)x*(i+1);
        }
   
        return answer;
    }
}
/*
문제 설명
함수 solution은 정수 x와 자연수 n을 입력 받아,
 x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 
 -----------------------------------------------
 
 answer의 배열의 길이는 n값만큼 지정해주고
 n만큼 for문을 돌려서 answer배열 인덱스에 들어갈 숫자를 지정해준다
 지정하는 숫자는 x만큼 증가하므로 x*i를 해준다 i+1을 해주는 이유는 i가 0부터 시작하므로 
 곱할떄 0이 되는걸 방지해준다.
 */