import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // list 선언
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int a = numbers[i]+numbers[j];
                
                if(!list.contains(a)){// list에 a값이 포함되냐? 안되면 포함시켜라!
                    list.add(a);
                }
            }
        }

        int[] answer = new int[list.size()];//answer 배열선언, 그배열의 크기는 list.size의 크기다.
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}