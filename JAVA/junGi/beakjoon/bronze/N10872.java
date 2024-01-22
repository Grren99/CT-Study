package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N10872 {
    /**
     * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
     * 재귀함수
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}

