package JAVA.junGi.pro.level0;

public class Question19 {

        // 문자열 바꿔서 찾기
        // replace 함수로 교체 contains() 함수로 true or false 확인
        public int solution(String myString, String pat) {
            int answer = 0;
            String a = myString.replace("A", "X").replace("B", "A").replace("X", "B");
            if(a.contains(pat)){
                answer = 1;
            }
            return answer;
    }
}
