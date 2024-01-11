package JAVA.junGi.pro.level2;

import java.util.*;
public class Question8 {
    // 구명보트
    public int solution(int[] people, int limit) {
        int answer = 0;
        int index = 0;
        Arrays.sort(people);

        for(int i = people.length - 1; i >= index; i--){
            // 가장 큰 사람과 + 가장 작은 사람이 <= limit 조건이 true일때 answer++; index++;
            if(people[i] + people[index] <= limit){
                index++;
                answer++;
            }else{
                answer++;
            }

        }

        return answer;
    }
}
