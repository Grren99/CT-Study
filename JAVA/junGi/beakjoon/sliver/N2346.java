package JAVA.junGi.beakjoon.sliver;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class N2346 {
    /**
     * 다섯 개의 풍선 안에 차례로 3, 2, 1, -3, -1이 적혀 있었다고 하자. 이 경우 3이 적혀 있는 1번 풍선,
     * -3이 적혀 있는 4번 풍선, -1이 적혀 있는 5번 풍선, 1이 적혀 있는 3번 풍선, 2가 적혀 있는 2번 풍선의 순서대로 터지게 된다.
     */

    static class Balloon {
        int idx;
        int element;

        public Balloon(int idx, int element) {
            this.idx = idx;
            this.element = element;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Balloon> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.add(new Balloon(i, sc.nextInt()));
        }

        int prev = 0;
        StringBuilder ans = new StringBuilder();

        while (deque.size() > 1) {
            Balloon cur = (prev >= 0) ?deque.pollFirst() : deque.pollLast();
            for (int i = 0; i < Math.abs(cur.element)-1; i++) {
                if(cur.element > 0)
                    deque.addLast(deque.pollFirst());
                else
                    deque.addFirst(deque.pollLast());
            }

            prev = cur.element;
            ans.append(cur.idx).append(" ");
        }
        ans.append(deque.poll().idx);

        System.out.println(ans);
    }
}
