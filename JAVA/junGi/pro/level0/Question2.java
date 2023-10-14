package JAVA.junGi.pro.level0;

public class Question2 {
    // 9로 나눈 나머지
    static class Solution {
        public int solution(String number) {
            int answer = 0;
            String[] numbers = number.split("");
            int sum = 0;

            for(String i : numbers){
                sum += Integer.parseInt(i);
            }

            answer = sum % 9;
            return answer;
        }
    }
}
