package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N9086 {
    /**
     * 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for(int i = 0; i < count; i++){
            String str = sc.next();
            String first = String.valueOf(str.charAt(0));
            String end = String.valueOf(str.charAt(str.length() - 1));
            System.out.println(first + end);

        }

    }
}
