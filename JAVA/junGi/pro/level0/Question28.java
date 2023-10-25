package JAVA.junGi.pro.level0;

public class Question28 {
        // 2 진수 더하기
        // Integer.toBinaryString() 활용
        public String solution(String bin1, String bin2) {
            String answer = "";
            int value1 = Integer.parseInt(bin1, 2);
            int value2 = Integer.parseInt(bin2, 2);
            int sum = value1 + value2;

            answer = Integer.toBinaryString(sum);
            return answer;
        }
    }
