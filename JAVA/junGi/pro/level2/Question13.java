package JAVA.junGi.pro.level2;
import java.util.*;

public class Question13 {
    // 주식 가격
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < prices.length; i++){

            // 스택이 비어 있지 않고 price[stack.peek()] 이 price[i]보다 클떄
            // stack.peek() = 0, 1, 2...~
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            // 스택에 데이터 넣기
            stack.push(i);

        }
        // 최종 값 입력
        while(!stack.isEmpty()){
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        return answer;
    }
}
