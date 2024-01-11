package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N11720 {
    /**
     * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        String value = sc.next();

        String[] sp = value.split("");
        int result = 0;

        for(int i = 0 ; i < index; i++){
            result += Integer.parseInt(sp[i]);
        }
        System.out.println(result);
    }
}
