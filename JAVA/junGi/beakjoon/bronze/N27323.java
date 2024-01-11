package JAVA.junGi.beakjoon.bronze;

import java.security.PublicKey;
import java.util.Scanner;

public class N27323 {

    /**
     * 정수 A, B 가 주어진다. 세로 길이가 A cm, 가로 길이가 B cm 인 아래와 같은 직사각형의 넓이를 cm2 단위로 구하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int heigth = sc.nextInt();
        int result = system(width, heigth);
        System.out.println(result);
    }

    // A B의 넓이 구하는 시스템
    public static int system(int A , int B){
        int answer = 0;

        if(A != 0 && B != 0){
            answer = A * B;
        }

        return answer;
    }
}
