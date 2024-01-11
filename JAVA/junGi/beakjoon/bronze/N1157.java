package JAVA.junGi.beakjoon.bronze;

import java.util.*;

public class N1157 {
    /**
     * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
     * 단, 대문자와 소문자를 구분하지 않는다.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 중복된 값이 Key가 있으면 + 1
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if (value > maxCount) {
                maxCount = value;
            }

        }
        String answer = "";
        // maxCount와 일치하는 key 출력
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if (value == maxCount) {
                answer += key;
            }
        }
        String[] sp = answer.split("");
        String result = sp.length > 1 ? "?" : sp[0];
        System.out.println(result);

    }
}
