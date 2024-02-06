package JAVA.junGi.beakjoon.sliver;

import java.util.Scanner;

public class N1003 {
    /**
     * 피보나치 함수
     * 0 과 1의 출력 횟수
     */
    static Integer[] arr = new Integer[41];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        arr[0] = 0;
        arr[1] = 1;

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int n = sc.nextInt();
            Fibonacci(n);
            if(n == 0){
                System.out.println("1 0");
            }else if (n == 1){
                System.out.println("0 1");
            }else {
                System.out.println(new StringBuffer().append(arr[n - 1]).append(" ").append(arr[n]).toString());
            }
        }
    }
    public static int Fibonacci(int n){
        if (arr[n] == null){
            arr[n] = Fibonacci(n - 1) + Fibonacci(n - 2);
        }
        return arr[n];
    }
}
