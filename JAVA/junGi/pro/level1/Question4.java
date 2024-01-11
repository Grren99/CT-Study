package JAVA.junGi.pro.level1;
import java.util.*;
public class Question4 {
    // 제일 작은 수 제거하기
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }

        if (answer.size() == 1) {
            answer.remove(0);
            answer.add(-1);
        }else{
            int min = Collections.min(answer);
            answer.remove(Integer.valueOf(min));
        }

        return answer.stream().mapToInt(x -> x).toArray();
    }

}
