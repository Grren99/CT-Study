package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N27866 {
    /**
     * 단어
     * $S$와 정수
     * $i$가 주어졌을 때,
     * $S$의
     * $i$번째 글자를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 문자열 값
        String str = sc.next();
        // 뽑을 값
        int value = sc.nextInt();

        String newStr = str.substring(value - 1 , value);
        System.out.println( newStr);
    }
}
