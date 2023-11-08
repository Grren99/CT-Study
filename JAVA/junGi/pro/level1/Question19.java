package JAVA.junGi.pro.level1;
import java.util.*;

public class Question19 {
    // 두 개 뽑아서 더하기
    public int[] solution(int[] numbers) {

        Set<Integer> result = new HashSet<>();

        for(int i = 0; i < numbers.length; i++){

            for(int j = i + 1; j < numbers.length; j++){
                result.add(numbers[i] + numbers[j]);
            }
        }

        return result.stream().sorted().mapToInt(x -> x).toArray();
    }
}
