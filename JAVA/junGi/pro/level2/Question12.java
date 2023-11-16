package JAVA.junGi.pro.level2;
import java.util.*;

public class Question12 {
    // 프로세스
    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int v : priorities){
            queue.add(v);
        }

        // queue가 빌떄까지 반복
        while(!queue.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(queue.peek() == priorities[i]){
                    queue.poll();
                    answer++;
                    if(location == i){
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}
