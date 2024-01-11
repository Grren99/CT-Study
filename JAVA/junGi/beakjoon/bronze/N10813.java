package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N10813 {
    /**
     * 5 4
     * 1 2
     * 3 4
     * 1 4
     * 2 2
     * 일 때 출력
     *
     * 0 1 2 3 4 5
     *
     * 0 2 1 3 4 5
     *
     * 0 2 1 4 3 5
     *
     * 0 3 1 4 2 5
     *
     * 0 3 1 4 2 5
     * **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N + 1];

        // N = 5 -> 1, 2, 3, 4, 5
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < M; i++) {

            int F = sc.nextInt();
            int E = sc.nextInt();
            int tmp = arr[F];
           // 값 교환
           arr[F] = arr[E];
           arr[E] = tmp;
        }
        sc.close();

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
