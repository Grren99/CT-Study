package JAVA.junGi.pro.level1;
import java.util.*;

public class Question11 {

    // 같은 숫자는 싫어
    public int[] solution(int []arr) {
        List<Integer> result = new ArrayList<>();
        result.add(arr[0]);

        for(int i = 1; i < arr.length; i++){

            if(arr[i] != arr[i - 1]){
                result.add(arr[i]);
            }
        }


        return result.stream().mapToInt(x -> x).toArray();
    }
}
