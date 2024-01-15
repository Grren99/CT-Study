package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N24723 {
    /**
     * 녹색 거탑
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // 2를 N번 곱한 값이 답이다.
        System.out.println((int) Math.pow(2, N));
    }
}
