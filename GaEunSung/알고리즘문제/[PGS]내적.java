class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i=0; i<a.length; i++){
           answer += a[i]*b[i];
        }
        return answer;
        //  두배열의 같은 인덱스를 가진 것끼리 곱해서 합을 도출
    }
}