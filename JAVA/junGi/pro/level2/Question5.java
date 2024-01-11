package JAVA.junGi.pro.level2;
import java.util.*;
public class Question5 {
        // 기능 개발
        public int[] solution(int[] progresses, int[] speeds) {
            Queue<Integer> queue = new LinkedList<>();
            for(int i=0; i<progresses.length; i++){
                queue.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
            }

            List<Integer> answer = new ArrayList<>();
            while (!queue.isEmpty()){
                int day = queue.poll();
                int cnt = 1;

                while(!queue.isEmpty() && day >= queue.peek()){
                    cnt++;
                    queue.poll();
                }
                answer.add(cnt);
            }

            return answer.stream().mapToInt(Integer::intValue).toArray();
        }

}
