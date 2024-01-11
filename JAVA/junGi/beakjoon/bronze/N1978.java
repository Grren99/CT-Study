package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N1978 {
    /**
     * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int answer = 0;
        for(int i = 0 ; i < size; i++){

            int value = sc.nextInt();

            if (isPrime(value)) answer++;
        }
        System.out.println(answer);
    }
    public static boolean isPrime(int num){
        // false -> 소수 , 아님 true -> 소수
        if(num <= 1) return false; // 1 이하는 소수가 아님

        for(int i = 2; i <= Math.sqrt(num); i++){ // <= 기호를 사용해야 정확한 값 구하기 가능
            if(num % i == 0){ // 나누어 떨어지면 소수가 아님
                return false;
            }
        }

        return true;
    }
}
