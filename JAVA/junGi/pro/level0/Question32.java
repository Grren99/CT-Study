package JAVA.junGi.pro.level0;

public class Question32 {

    //저주의 숫자 3
    // 3의 배수 or 3를 포함한 값이 들어 오면 answer++
    class Solution {
        public int solution(int n) {
            int answer = 0;

            for(int i = 0 ; i < n; i++){
                answer++;
                while(answer % 3 == 0 || String.valueOf(answer).contains("3")){
                    answer++;
                }

            }

            return answer;
        }
    }
}
