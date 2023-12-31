package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N10988 {

    /**
     * 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
     * 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
     * level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String reverseStr = reverseSystem(str);

        int answer = str.equals(reverseStr) ? 1 : 0;

        System.out.println(answer);
    }

    public static String reverseSystem(String str){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--){
            char c = str.charAt(i);
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
