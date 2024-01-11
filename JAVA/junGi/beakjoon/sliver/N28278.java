package JAVA.junGi.beakjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class N28278 {
    /**
     * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
     * 명령은 총 다섯 가지이다.
     * 1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
     * 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
     * 3: 스택에 들어있는 정수의 개수를 출력한다.
     * 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
     * 5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다
     */
    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //명령어의 수

        while(N --> 0){
            solution(br.readLine());
        }

        br.close();

        System.out.println(sb);
    }

    static void solution(String query){
        char c = query.charAt(0); //첫번째 문자는 명령어

        switch (c){
            //case 1의 경우 query.substring(2);를 한 이유는 공백도 문자로 포함하기 때문이다 1 X 형태이기 때문에 X의인덱스는 2다.
            case '1' : stack.push(Integer.parseInt(query.substring(2))); return;
            case '2' : sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n"); return;
            case '3' : sb.append(stack.size()).append("\n"); return;
            case '4' : sb.append(stack.isEmpty() ? 1 : 0).append("\n"); return;
            case '5' : sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n"); return;
            default: break;
        }
    }
}
