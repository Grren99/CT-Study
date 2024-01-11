package JAVA.junGi.beakjoon.sliver;

import java.util.Scanner;

public class N4134 {
    /**
     * 정수 n(0 ≤ n ≤ 4*109)가 주어졌을 때, n보다 크거나 같은 소수 중 가장 작은 소수 찾는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long index = sc.nextLong();

        for(int i = 0; i < index; i++){
            long value = sc.nextLong();

            long answer = minPrime(value); // 프로그램 실행
            System.out.println(answer); // 최종 출력
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

    // 가장 작은 소수 찾기 프로그램
    public static long minPrime(long num){

        if(num <= 1){
            return 2; // 1보다 작거나 같으면 가장 작은 소수 "2"
        }
        while (true){
            if(isPrime(num)){ // 소수 판별 프로그램
                return num; // 소수가 아니라면 num++로 주어진 값에서 소수 찾기
            }
            num++;
        }
    }
}
