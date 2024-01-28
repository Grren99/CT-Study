package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N10870 {
    /**
     * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다.
     * 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(Pibonachi(n));
    }
    public static long Pibonachi(int num){
        int answer = 0;

        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }

        long[] fib = new long[num + 1];
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i <= num; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[num];
    }
}
