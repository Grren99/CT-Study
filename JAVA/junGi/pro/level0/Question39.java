package JAVA.junGi.pro.level0;

public class Question39 {
        //팩토리얼
        public int solution(int n) {
            int answer = 1;

            for(int i = 1; i <= 10; i++){

                answer *= i;

                if(answer == n){
                    answer = i;
                    break;
                }else if (n < answer){
                    answer = (i - 1);
                    break;
                }
            }

            return answer;
    }
}
