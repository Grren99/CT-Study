package JAVA.junGi.pro.level0;
import java.util.*;
public class Question11 {
        // 5명씩
        public String[] solution(String[] names) {
            String[] answer = new String[names.length]; // names와 같은 길이의 배열을 초기화
            int answerIndex = 0; // answer 배열에 값을 추가할 인덱스

            for (int i = 0; i < names.length; i++) {
                if (i == 0 || i % 5 == 0) {
                    answer[answerIndex] = names[i];
                    answerIndex++;
                }
            }

            // 만약 answer 배열을 정확하게 크기에 맞게 자르고 싶다면, 불필요한 빈 요소를 제거할 수 있습니다.
            return Arrays.copyOf(answer, answerIndex);
        }
}
