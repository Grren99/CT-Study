package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N10951 {

    /**
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     * **/

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
