걸린 시간 : 10분
레벨 : LV.1


import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < answer.length; i++) {
        	
            
        	if(!map.containsKey(s.charAt(i))) {
        		map.put(s.charAt(i), i);
        		answer[i] = -1;
        	}
            else {
        		int num = i - map.get(s.charAt(i));
        		answer[i] = num;
        		map.put(s.charAt(i), i);
        	}

        }
        
        
        return answer;
    }
}