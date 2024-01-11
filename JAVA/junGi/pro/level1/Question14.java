package JAVA.junGi.pro.level1;
import java.util.Map;
import java.util.HashMap;
public class Question14 {
        // 가장 가까운 글자
        public int[] solution(String s) {
            int[] answer = new int[s.length()];
            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    answer[i] = -1;
                    map.put(s.charAt(i), i);
                } else {
                    answer[i] = i - map.get(s.charAt(i));
                    map.put(s.charAt(i), i);
                }
            }

            return answer;
        }

}
