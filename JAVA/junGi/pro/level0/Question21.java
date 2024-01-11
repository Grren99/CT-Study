package JAVA.junGi.pro.level0;
import java.util.*;

public class Question21 {

    //무작위로 K개수 수 뽑기
        public int[] solution(int[] arr, int k) {
            List<Integer> result = new ArrayList<>();

            for(int i = 0; i < arr.length; i++){
                if(result.size() == k) break;
                if(!result.contains(arr[i])) result.add(arr[i]);
            }
            while(result.size() < k) result.add(-1);
            return result.stream().mapToInt(x->x).toArray();
    }
}
