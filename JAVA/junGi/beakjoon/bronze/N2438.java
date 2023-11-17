package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N2438 {
    /**
     * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
     * **/

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for(int i = 0 ; i < count; i++){
            System.out.print("*");
            for(int j = 0 ; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
