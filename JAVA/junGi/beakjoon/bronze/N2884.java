package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N2884 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        // 45 빼기
        final int MINUS = 45;

        if(M < 45){
            H--;
            M = 60 - (MINUS - M);
            if(H < 0){
                H = 23;
            }
            System.out.print(H + " " + M);
        }else{
            System.out.print(H + " " + (M - MINUS));
        }
    }
}
