package JAVA.junGi.pro.level0;

public class Question44 {
        // 분수의 덧셈
        // 기약분수 만들기
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int numerator = (numer1 * denom2) + (numer2 * denom1);
            int denominator = denom1 * denom2;

            for(int i = numerator-1; i > 1; i--) {
                // 기약분수로 만들기
                if(numerator % i == 0 && denominator % i == 0) {
                    numerator /= i;
                    denominator /= i;
                }
            }

            int[] answer = { numerator, denominator };
            return answer;
    }
}
