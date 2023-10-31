package JAVA.junGi.pro.level0;
import java.util.*;
public class Question40 {

        //합성수 찾기
        public int solution(int n) {
            int answer = 1;
            List<Integer> result = new ArrayList<>();

            for(int i = 1; i <= n; i++){

                if(isComposite(i)){
                    result.add(i);
                }

            }
            answer = result.size();
            return answer;
        }
        public boolean isComposite(int number) {
            if (number <= 1) {
                return false; // 1 이하의 숫자는 합성수가 아닙니다.
            }

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return true; // 어떤 수로 나누어 떨어지면 합성수입니다.
                }
            }

            return false; // 어떤 수로도 나누어 떨어지지 않으면 소수입니다.
        }
    }
