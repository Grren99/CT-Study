package JAVA.junGi.pro.level1;
import java.util.*;

public class Question29 {

    // 명예의 전당(1)
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> result = new ArrayList<>();

        for(int i = 0 ; i < score.length; i++){

            result.add(score[i]);

            if(result.size() > k){
                result.remove(Collections.min(result));
            }
            answer[i] = Collections.min(result);

        }

        return answer;
    }
}
