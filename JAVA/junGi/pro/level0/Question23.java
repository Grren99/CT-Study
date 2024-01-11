package JAVA.junGi.pro.level0;

public class Question23 {

        // 문자열 하나씩 밀기
        public int solution(String A, String B) {
            int answer = 0;
            String copy = A;

            for (int i = 0; i < A.length(); i++) {
                if (copy.equals(B)) {
                    return answer;
                }

                String a = copy.substring(copy.length() - 1);
                copy = a + copy.substring(0, copy.length() - 1);
                answer++;
            }

            return -1;
    }
}
