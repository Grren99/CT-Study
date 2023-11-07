package JAVA.junGi.pro.level1;

public class Question6 {
    // 핸드폰 번호 가리기
    // repeat 함수 사용
    public String solution(String phone_number) {
        int length = phone_number.length();
        String answer = "";

        String stars = "*".repeat(length - 4);
        String lastFour = phone_number.substring(length - 4);
        answer = stars + lastFour;

        return answer;
    }

}
