package JAVA.junGi.pro.level0;
import java.util.*;

public class Question38 {
    // 소인수 분해

        public int[] solution(int n) {
            List<Integer> answer = new ArrayList<>();

            for(int i = 2; i <= n; i++){

                while(n % i == 0){
                    if(!answer.contains(i))
                        answer.add(i);
                    n /= i;
                }

            }

            return answer.stream().mapToInt(x -> x).toArray();
    }
}
