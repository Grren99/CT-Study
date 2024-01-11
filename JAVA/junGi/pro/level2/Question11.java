package JAVA.junGi.pro.level2;
import java.util.*;

public class Question11 {
    // 더 맵게
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int v : scoville){
            heap.add(v);
        }

        while(heap.peek() < K){

            if(heap.size() < 2){
                return -1;
            }

            int first = heap.poll();
            int second = heap.poll();

            int newValue = first + (second * 2);
            heap.add(newValue);
            answer++;
        }

        return answer;
    }
}
