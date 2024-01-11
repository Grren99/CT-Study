package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N11653 {
    /**
     * 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        system(N);
    }

    //소인수 분해 시스템
    public static void system(int num){

        for(int i = 2; i <= num; i++){
            while (num % i == 0){
                System.out.println(i);
                num = num / i;

            }
        }
    }
}
