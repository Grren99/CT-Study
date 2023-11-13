package JAVA.junGi.pro.level2;

import java.util.*;

class Question3
{
    // 짝 지어 제거하기
    public int solution(String s)
    {
        int answer = 0;

        Stack<String> stack = new Stack<>();
        String[] sp = s.split("");
        
        for(int i = 0 ; i < sp.length; i++){
            
            if(!stack.isEmpty() && stack.peek().equals(sp[i])){
                stack.pop();
            }else{
                stack.add(sp[i]);
            }
            
        }
        
        answer = stack.isEmpty() ? 1 : 0;
        return answer;
    }
}