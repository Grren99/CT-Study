package JAVA.junGi.beakjoon.sliver;

import java.util.Scanner;
import java.util.Stack;

public class N4949 {
    /**
     *문자열에 포함되는 괄호는 소괄호("()") 와 대괄호("[]")로 2종류이고, 문자열이 균형을 이루는 조건은 아래와 같다.
     * 모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이뤄야 한다.
     * 모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이뤄야 한다.
     * 모든 오른쪽 괄호들은 자신과 짝을 이룰 수 있는 왼쪽 괄호가 존재한다.
     * 모든 괄호들의 짝은 1:1 매칭만 가능하다. 즉, 괄호 하나가 둘 이상의 괄호와 짝지어지지 않는다.
     * 짝을 이루는 두 괄호가 있을 때, 그 사이에 있는 문자열도 균형이 잡혀야 한다.
     * 정민이를 도와 문자열이 주어졌을 때 균형잡힌 문자열인지 아닌지를 판단해보자.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            String value = sc.nextLine();

            if(value.equals(".")) break;

            if(search(value)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }

    }

    public static boolean search(String str){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == '(' || c == '['){
                stack.push(c);
            }else if(c == ')'){
                if(stack.empty() || stack.peek() != '('){
                    return false;
                }else{
                    stack.pop();
                }
            }else if(c == ']'){
                if(stack.empty() || stack.peek() != '['){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }
}
