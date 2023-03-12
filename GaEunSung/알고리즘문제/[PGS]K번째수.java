import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        // numbers의 수배열의 합을 담을 ArrayList생성
        ArrayList<Integer> sumArr = new ArrayList<>();
        
        //numbers의 숫자하나를 나머지 숫자하나하나 더하는 거기떄문에 길이보다 하나 작은수 만큼 for문을 돌림
        for(int i=0; i<numbers.length-1; i++){
            for(int j= i+1; j<numbers.length; j++){
                int temp = numbers[i] + numbers[j];   
                if(sumArr.indexOf(temp) < 0){ // 중복값이 아니라면 list에저장
                    sumArr.add(temp);
                } 
            }
        }
        
        int[] answer = new int[sumArr.size()]; //답의 배열의 수는 리스트 numArr의 사이즈만큼
        for(int i=0; i<answer.length; i++){ 
            answer[i] = sumArr.get(i); //answer배열에 리스트배열에 있는 아이들을 더해줌
        }
        Arrays.sort(answer); // 정렬
        return answer;
    }
}