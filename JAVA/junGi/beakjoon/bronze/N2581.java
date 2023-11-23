package JAVA.junGi.beakjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N2581 {
    /**
     * 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
     * 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        int minValue = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if(isPrime(i)){
                list.add(i);
            }
        }

        if(!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
                if(minValue == Integer.MAX_VALUE) minValue = list.get(i);
            }
            System.out.println(sum);
            System.out.print(minValue);
        }else{
            System.out.println(-1);
        }

    }
    // 에라토스테네스 체
    public static boolean isPrime(int num){

        if(num <= 1) return false;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0) return false;
        }

        return true;
    }

}
