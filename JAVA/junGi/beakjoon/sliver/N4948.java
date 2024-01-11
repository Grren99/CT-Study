package JAVA.junGi.beakjoon.sliver;

import java.util.Scanner;

public class N4948 {
    /**
     * 베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
     * 이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
     * 예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
     * 자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){

            int value = sc.nextInt();
            int count = 0;
            if(value == 0) break; // 마지막 0 출력 종료

            int N = value;
            int N2 = value*2;

            for(int i = N + 1; i <= N2; i++){

                if(isPrime(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static boolean isPrime(int num){

        if(num <= 1) return false;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }

        return true;
    }
}
