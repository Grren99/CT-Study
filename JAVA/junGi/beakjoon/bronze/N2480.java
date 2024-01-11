package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N2480 {
    /**
    같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
    같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
    모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
     **/
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;

        if(a == b && b == c){
            result = 10000 + a * 1000;
        }else if(a == b){
            result = 1000 + a * 100;
        }else if(b == c){
            result = 1000 + b * 100;
        }else if(a == c){
            result = 1000 + c * 100;
        }else{
            int max = Math.max(a , Math.max(b , c));
            result = max * 100;
        }

        System.out.println(result);
    }
}
