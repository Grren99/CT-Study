package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N2743 {
    /**
     * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 길이 뽑을 문자열
        String str = sc.next();

        System.out.println(str.length());

    }
}
