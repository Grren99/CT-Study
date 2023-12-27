package JAVA.junGi.beakjoon.sliver;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class N28279 {
    /**
     * 1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
     * 2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
     * 3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
     * 4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
     * 5: 덱에 들어있는 정수의 개수를 출력한다.
     * 6: 덱이 비어있으면 1, 아니면 0을 출력한다.
     * 7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
     * 8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Deque<Integer> deque = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < n; i++){
            int value = sc.nextInt();
            switch (value){
                case 1 :
                    int push1 = sc.nextInt();
                    deque.addFirst(push1);
                    break;
                case 2 :
                    int push2 = sc.nextInt();
                    deque.addLast(push2);
                    break;
                case 3 :
                    stringBuilder.append(!deque.isEmpty() ? deque.removeFirst() + "\n" : "-1" + "\n");
                    break;
                case 4 :
                    stringBuilder.append(!deque.isEmpty() ? deque.removeLast() + "\n": "-1" + "\n");
                    break;
                case 5 :
                    stringBuilder.append(deque.size() + "\n");
                    break;
                case 6 :
                    stringBuilder.append(!deque.isEmpty() ? "0" + "\n" : "1" + "\n");
                    break;
                case 7 :
                    stringBuilder.append(!deque.isEmpty() ? deque.getFirst() + "\n" : "-1" + "\n");
                    break;
                case 8 :
                    stringBuilder.append(!deque.isEmpty() ? deque.getLast() + "\n": "-1" + "\n");
                    break;
            }
        }
        System.out.println(stringBuilder);
    }
}
