package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N19532 {
    /**
     *정수
     * $a$,* $b$,* $c$,* $d$,* $e$,
     * $f$가 공백으로 구분되어 차례대로 주어진다. (* $-999 \leq a,b,c,d,e,f \leq 999$)
     * 문제에서 언급한 방정식을 만족하는
     * $\left(x,y\right)$가 유일하게 존재하고, 이 때* $x$와* $y$가 각각* $-999$ 이상
     * $999$ 이하의 정수인 경우만 입력으로 주어짐이 보장된다.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a , b , c , d , e , f , x = 0, y = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();

        for(int i = -999; i < 1000; i++){
            for(int j = -999; j < 1000; j++){
                if(a*i + b*j == c && d*i + e*j == f){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        System.out.println(x + " " + y);

    }

}
