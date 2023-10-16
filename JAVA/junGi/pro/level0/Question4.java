package JAVA.junGi.pro.level0;

public class Question4 {

    // 문자열 뒤에 n 글자
    static class Solution {
        public String solution(String my_string, int n) {
            String answer = "";
            answer = my_string.substring(my_string.length() - n);
            return answer;
        }
    }
}
