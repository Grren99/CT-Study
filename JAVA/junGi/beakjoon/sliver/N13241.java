package JAVA.junGi.beakjoon.sliver;

import java.util.Scanner;

public class N13241 {
    /**
     * 정수 B에 0보다 큰 정수인 N을 곱해 정수 A를 만들 수 있다면, A는 B의 배수이다.
     * 10은 5의 배수이다 (5*2 = 10)
     * 10은 10의 배수이다(10*1 = 10)
     * 6은 1의 배수이다(1*6 = 6)
     * 20은 1, 2, 4,5,10,20의 배수이다.
     * 당신은 두 수에 대하여 최소공배수를 구하는 프로그램을 작성 하는 것이 목표이다.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        System.out.println(LCD(A, B));
    }

    public static long LCD(long a , long b){
        return (a * b) / GCD(a, b);
    }
    public static long GCD(long a , long b){

        while (b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
