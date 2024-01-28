package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N27433 {
    /**
     * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(factori(n));
    }
    public static long factori(int num){

        if(num == 0){
            return 1;
        }
        if(num == 1){
            return 1;
        }

        return num * factori(num - 1);
    }
}
