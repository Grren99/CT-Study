package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N15894 {
    /**
     * "한 변의 길이가 1인 정사각형을 아래 그림과 같이 겹치지 않게 빈틈없이 계속 붙여 나간다.
     * 가장 아랫부분의 정사각형이 n개가 되었을 때, 실선으로 이루어진 도형의 둘레의 길이를 구하시오."
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        System.out.println(nLengthSearchSystem(N));
    }
    // N의 실선 길이를 구하는 시스템
    public static long nLengthSearchSystem(long num){
        return num * 4;
    }
}
