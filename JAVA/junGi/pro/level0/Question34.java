package JAVA.junGi.pro.level0;

public class Question34 {

        //숨어있는 숫자의 덧셈 (2)
        // 정규식 구하기, matches()함수 이용

        public int solution(String my_string) {
            int answer = 0;
            String[] sp = my_string.split("[a-zA-z]+");

            for(int i = 0 ; i < sp.length; i++){

                if(sp[i].matches("[0-9]+")){
                    answer += Integer.parseInt(sp[i]);
                }

            }

            return answer;
    }
}
