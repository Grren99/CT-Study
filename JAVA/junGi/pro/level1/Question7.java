package JAVA.junGi.pro.level1;

public class Question7 {
        // 최대공약수와 최소공배수
        public int[] solution(int n, int m) {
            int[] answer = new int[2];

            int gcd = getGCD(n, m);

            int lcm = (n * m) / gcd;

            answer[0] = gcd;
            answer[1] = lcm;

            return answer;
        }

        // 유클리드 호제법을 사용하여 최대 공약수(GCD) 계산
        private int getGCD(int a, int b) {
            while (b != 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
            return a;
        }

}
