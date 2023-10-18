package JAVA.junGi.pro.level0;
import java.util.*;

public class Question18 {
    // 문자열 잘라서 출력하기
    // 공백 제거 버전
    class Solution {
        public List<String> solution(String myString) {
            String[] answer = myString.split("x");
            Arrays.sort(answer);
            List<String> result = new ArrayList<>();
            for(int i = 0 ; i < answer.length; i++){
                if(!answer[i].isEmpty()){
                    result.add(answer[i]);
                }
            }
            return result;
        }
    }
}
