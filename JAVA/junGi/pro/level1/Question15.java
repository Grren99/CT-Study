package JAVA.junGi.pro.level1;
import java.util.*;

public class Question15 {
        // 완주 하지 못한 선수
        // 정렬 방법 채택 할려 했지만 시간효율성이 좋지 못해 HashMap 이용
        // getOrDefault()메소드 사용
        public String solution(String[] participant, String[] completion) {
            String answer = "";

            HashMap<String, Integer> result = new HashMap<>();

            for(String name : participant){
                // 중복된 key Value가 있을시 +1
                result.put(name, result.getOrDefault(name, 0) + 1);
            }

            for(String name : completion){
                result.put(name, result.get(name) - 1);
            }

            for (Map.Entry<String, Integer> entry : result.entrySet()) {
                if (entry.getValue() == 1) {
                    answer = entry.getKey();
                    break;
                }
            }

            return answer;
        }
}
