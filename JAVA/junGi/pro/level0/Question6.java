package JAVA.junGi.pro.level0;

public class Question6 {

        // 문자열 뒤집기
        // StringBuilder 응용
        public String solution(String my_string, int s, int e) {

            StringBuilder sb = new StringBuilder(my_string);
            StringBuilder reversedSubstring = new StringBuilder(sb.substring(s, e + 1)).reverse();
            sb.replace(s, e + 1, reversedSubstring.toString());

            System.out.print(sb.toString());
            return sb.toString();
    }

}
