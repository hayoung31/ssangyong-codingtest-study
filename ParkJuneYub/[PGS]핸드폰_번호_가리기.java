걸린 시간 : 4분
레벨 : LV1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public String solution(String phone_number) {
    	String answer = "";
        int len = phone_number.length();

        for(int i = 0; i < len-4; i++) {
            answer += "*";
        }
        
        String tmp = phone_number.substring(len-4, len);
        answer += tmp;

        
        
        
        
        return answer;
    }
}