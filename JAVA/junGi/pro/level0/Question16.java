package JAVA.junGi.pro.level0;

public class Question16 {

        // 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
        // lastIndexOf() 메소드 활용
        public String solution(String myString, String pat) {
            String answer = "";
            int index = myString.lastIndexOf(pat);
            answer = myString.substring(0 , index ) + pat;
            return answer;
    }
}
