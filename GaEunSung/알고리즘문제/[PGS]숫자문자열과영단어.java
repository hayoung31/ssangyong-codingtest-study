class Solution {
    public int solution(String s) {
       
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};  
        
        for(int i=0; i<10; i++){
            s = s.replace(strArr[i], Integer.toString(i));
        }
        //s에 스트링에 strArr과 같은 문자열이 있다면 그 문자열을 인덱스i의 숫자로 바꿔준다.
        //인덱스[i]의 값은 스트링으로 변환
        
        int answer = Integer.parseInt(s);
        // answer에는 String s를 int값으로 파싱한걸 담음
        return answer;
    }
}