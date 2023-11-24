package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N10101 {
    /**
     * 삼각형의 세 각을 입력받은 다음,
         * 세 각의 크기가 모두 60이면, Equilateral
         * 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
         * 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
         * 세 각의 합이 180이 아닌 경우에는 Error
     * 를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = A + B + C;
        String answer = "";
        while (true){
            if(sum != 180){
                answer = "Error";
                break;
            }
            if(A == 60 && B == 60 && C == 60){
                answer = "Equilateral";
                break;
            }
            else if(A == B || B == C || A == C){
                answer = "Isosceles";
                break;
            }
            else {
                answer = "Scalene";
                break;
            }
        }
        System.out.println(answer);
    }
}
