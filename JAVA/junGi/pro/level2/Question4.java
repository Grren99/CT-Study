package JAVA.junGi.pro.level2;

public class Question4 {
        // JadenCase 문자열 만들기
        public String solution(String s) {
            String answer = "";
            String[] sp = s.toLowerCase().split("");

            for (int i = 0; i < sp.length; i++) {
                if (sp[i].equals(" ") && i + 1 < sp.length && !sp[i + 1].equals(" ")) {
                    sp[i + 1] = sp[i + 1].toUpperCase();
                }
                sp[0] = sp[0].toUpperCase();
                answer += sp[i];
            }
            return answer;
        }

}
