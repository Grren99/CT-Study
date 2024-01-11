package JAVA.junGi.pro.level1;

public class Question30 {

    // 기사 단원의 무기
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int result = divisors(i);

            answer += (result <= limit) ? result : power;
        }


        return answer;
    }

    public int divisors(int num) {
        int count = 0;
        // 속도 개선을 위한 제곱근 확인
        int sqrtNum = (int) Math.sqrt(num);

        for (int i = 1; i <= sqrtNum; i++) {
            if (num % i == 0) {
                count += (i == num / i) ? 1 : 2;
            }
        }

        return count;
    }
}
