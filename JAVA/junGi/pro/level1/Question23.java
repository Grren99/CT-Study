package JAVA.junGi.pro.level1;

public class Question23 {

        // 푸드 파이터 대회
        public static String solution(int[] food) {

            StringBuilder sb = new StringBuilder();

            for(int i=1; i<food.length; i++) {
                int share = food[i] / 2;

                for(int j=0; j<share; j++) {
                    sb.append(i);
                }
            }

            String answer = sb.toString() + "0" + sb.reverse().toString();

            return answer;
        }
}
