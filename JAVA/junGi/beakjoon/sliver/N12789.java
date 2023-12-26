package JAVA.junGi.beakjoon.sliver;

import java.util.Scanner;
import java.util.Stack;

public class N12789 {
    /**
     * 사람들은 현재 1열로 줄을 서있고, 맨 앞의 사람만 이동이 가능하다. 인규는 번호표 순서대로만 통과할 수 있는 라인을 만들어 두었다.
     * 이 라인과 대기열의 맨 앞 사람 사이에는 한 사람씩 1열이 들어갈 수 있는 공간이 있다. 현재 대기열의 사람들은 이 공간으로 올 수 있지만 반대는 불가능하다.
     * 승환이를 도와 프로그램을 완성하라.
     * 입력의 첫째 줄에는 현재 승환이의 앞에 서 있는 학생들의 수 N(1 ≤ N ≤ 1,000,자연수)이 주어진다.
     * 다음 줄에는 승환이 앞에 서있는 모든 학생들의 번호표(1,2,...,N) 순서가 앞에서부터 뒤 순서로 주어진다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            stack1.push(num);
        }

        for(int i = 0; i < stack1.size(); i++){
            if(stack1.get(i) != start){
                if(!stack2.isEmpty() && stack2.peek() == start) {
                    stack2.pop();
                    i--;
                    start++;
                }else{
                    stack2.push(stack1.get(i));
                }
            }else{
                start++;
            }
        }

        boolean result = true;

        for(int i = 0; i < stack2.size(); i++){
            int value = stack2.pop();

            if(value == start){
                start++;
            }else{
                result = false;
                break;
            }
        }
        System.out.println(result ? "Nice" : "Sad");
    }
}
