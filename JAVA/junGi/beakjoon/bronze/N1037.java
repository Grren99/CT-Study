package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N1037 {
    /**
     *양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다.
     * 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;

        while (T-- > 0){
            int N = sc.nextInt();

            MAX = N > MAX ? N : MAX;
            MIN = N < MIN ? N : MIN;
        }
        System.out.println(MAX * MIN);
    }
}
