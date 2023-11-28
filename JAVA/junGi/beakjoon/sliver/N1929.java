package JAVA.junGi.beakjoon.sliver;

import java.util.Scanner;

public class N1929 {
    /**
     * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long M = sc.nextLong();
        long N = sc.nextLong();

        for(long i = M; i <= N; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    // 소수 여부 프로그램
    public static boolean isPrime(long num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
