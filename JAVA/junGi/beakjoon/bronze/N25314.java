package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N25314 {
    /**
     * 첫 번째 줄에는 문제의 정수
     * $N$이 주어진다.
     * $(4\le N\le 1\, 000$;
     * $N$은
     * $4$의 배수
     * **/

    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        String base = "long int";
        String str = "";
        int count = 0;
        for(int i = 1 ; i <= value; i++){
            if(i % 4 == 0){
                count++;
            }
        }
        for(int i = 1; i < count; i++){
            str += "long ";
        }
        String answer = value == 4 ? base : str + base;
        System.out.println(answer);


    }
}
