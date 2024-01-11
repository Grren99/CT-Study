package JAVA.junGi.beakjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N18258 {
    /**
     * push X: 정수 X를 큐에 넣는 연산이다.
     * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * size: 큐에 들어있는 정수의 개수를 출력한다.
     * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
     * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        int lastAdded = -1;

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String operation = st.nextToken();

            switch (operation) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    queue.add(x);
                    lastAdded = x;
                    break;
                case "pop":
                    sb.append(!queue.isEmpty() ? queue.poll() : -1).append('\n');
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    sb.append(!queue.isEmpty() ? queue.peek() : -1).append('\n');
                    break;
                case "back":
                    sb.append(!queue.isEmpty() ? lastAdded : -1).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
