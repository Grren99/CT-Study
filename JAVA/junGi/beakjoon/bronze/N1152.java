package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N1152 {
    /**
     * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
     * 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // nextLine으로 설정해야 length 값 잘 가지고 옴
        String value = sc.nextLine();
        String[] sp = value.trim().split(" ");

        if(sp.length == 0){
            System.out.println(0);
        }else if(sp[0].equals("")){
            System.out.println(sp.length - 1);
        }else{
            System.out.println(sp.length);
        }
    }
}
