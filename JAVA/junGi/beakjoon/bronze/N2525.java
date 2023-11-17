package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N2525 {
    public static void main(String [] arg){

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int plus = sc.nextInt();
        int value = M + plus;

        if (value >= 60) {
            H += value / 60;
            M = value % 60;
            if (H > 23) { H %= 24; }
            System.out.println(H + " " + M);
        } else {
            M = value;
            System.out.println(H + " " + M);
        }

    }
}
