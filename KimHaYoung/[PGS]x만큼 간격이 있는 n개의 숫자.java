/*
프로그래머스 x만큼 간격이 있는 n개의 숫자
문제 설명
함수 solution은 정수 x와 자연수 n을 입력 받아,
x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

제한 조건
x는 -10000000 이상, 10000000 이하인 정수입니다.
n은 1000 이하인 자연수입니다.
*/



class Solution {
    public long[] solution(int x, int n) {
        
        long[] answer = new long[n];
        for(int i = 0; i<n; i++){
            answer[i] = (long)x*(i+1) ; // 오버플로우를 해결하기 위해 long으로 강제 형변환
        }
        return answer;
    }
}
// 주석1 오버플로우

// 테스트 2개가 문제가 생길 수 있다.
// 예를 들어 x가 10000000 n이 1000 일 경우 100억이 값으로 나온다.  
// x와 i 둘 다 int이고 각 변수의 데이터값 범위를 넘지 않았고 answer 배열은 long 타입이기 때문에
// 상관이 없다고 생각할 수 있다.
// 하지만 변수의 값이 데이터 타입의 범위를 넘지 않아도 연산과정에서 해당 데이터값의 범위를 넘게 되는 경우
// 오버플로우(적을 경우 언더플로우)가 발생하여 제대로된 값을 받지 못한다.
// 따라서 강제형 변환 등을 해줘야한다.
// 오버 플로우에 대한 추가 설명 및 해결 방안들 https://velog.io/@m1naworld/Java-%EC%A0%95%EC%88%98-%EC%98%A4%EB%B2%84%ED%94%8C%EB%A1%9C%EC%9A%B0Integer-overflow

// 주석2 x가 아닌 n이나 i에 long을 주면 error: incompatible types:
// possible lossy conversion from long to int 오류가 발생하는 이유
// 자바는 array 배열의 크기를 int 로 잡고 있다. 따라서  Integer.MAX_VALUE(2147483647) 이 보다
// 더 큰 크기를 가진 배열을 생성할 수 없고 그러기 위해서는 다른 방법을 사용해야한다.
// 스택 플로우 질문 및 답변 https://stackoverflow.com/questions/21828099/possible-lossy-conversion-from-long-to-int
