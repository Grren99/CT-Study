package JAVA.junGi.pro.level0;
import java.util.*;

public class Question3 {
    // 배열만들기 5
    class Solution {
        public int[] solution(String[] intStrs, int k, int s, int l) {
            List<Integer> result = new ArrayList<>();

            for (String str : intStrs) {
                int i = Integer.parseInt(str.substring(s, s + l));
                if (i > k) {
                    result.add(i);
                }
            }
            return result.stream().mapToInt(i->i).toArray();
        }
    }
}
