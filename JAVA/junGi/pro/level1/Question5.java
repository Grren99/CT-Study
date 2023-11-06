package JAVA.junGi.pro.level1;

public class Question5 {
        // 정수 제곱근 판별
        // 시간 복작도로 인한 Math.sqrt 함수 이용
        public long solution(long n) {
            double sqrt = Math.sqrt(n);

            if (sqrt == (int) sqrt) {
                int sum = (int) sqrt + 1;
                return (long) sum * sum;
            } else {
                return -1;
            }
        }

}
