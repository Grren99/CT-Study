package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N1934 {
    /**
     * 두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다.
     * 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
     * 두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();

        for (int i = 0; i < index; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int answer = LCM(A, B);
            System.out.println(answer);
        }
    }
    // 최소 공배수를 구하는 메소드
    public static int LCM(int a , int b){
        return (a * b) / GCD(a , b);
    }
    // 최대 공약수 먼저 구해 주기 (유클리드 호제법)
    public static int GCD(int a , int b){

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
