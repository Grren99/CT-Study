package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N11050 {
    /**
     *자연수
     * \(N\)과 정수
     * \(K\)가 주어졌을 때 이항 계수
     * \(\binom{N}{K}\)를 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(binomialCoefficient(n, k));
    }

    public static int binomialCoefficient(int n, int k){
        if(k == 0 || k == n){
            return 1;
        }else{
            return binomialCoefficient(n-1 , k-1) + binomialCoefficient(n-1 , k);
        }
    }
}
