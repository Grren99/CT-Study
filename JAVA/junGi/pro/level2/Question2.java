package JAVA.junGi.pro.level2;
import java.util.*;
public class Question2 {

        // 올바른 괄호
        // Stack 이용한 풀이
        boolean solution(String s) {
            boolean answer = true;
            Stack<Character> stack = new Stack<>();

            for(int i = 0 ; i < s.length(); i++){
                char c = s.charAt(i);

                if(c == '('){
                    stack.push(c);
                }

                if(c == ')'){

                    if(stack.size() == 0){
                        return false;
                    }else{
                        stack.pop();
                    }

                }
            }

            if(stack.size() != 0) answer = false;


            return answer;
        }
}
