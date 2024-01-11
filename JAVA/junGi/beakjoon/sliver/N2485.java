package JAVA.junGi.beakjoon.sliver;

import java.util.Scanner;

public class N2485 {
    /**
     * 예를 들어, 가로수가 (1, 3, 7, 13)의 위치에 있다면 (5, 9, 11)의 위치에 가로수를 더 심으면 모든 가로수들의 간격이 같게 된다.
     * 또한, 가로수가 (2, 6, 12, 18)에 있다면 (4, 8, 10, 14, 16)에 가로수를 더 심어야 한다.
     * 심어져 있는 가로수의 위치가 주어질 때, 모든 가로수가 같은 간격이 되도록 새로 심어야 하는 가로수의 최소수를 구하는 프로그램을 작성하라. 단, 추가되는 나무는 기존의 나무들 사이에만 심을 수 있다.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        int[] arr = new int[index];
        int gcd = 0;
        int answer = 0;
        for(int i = 0 ; i < index; i++){
            int value = sc.nextInt();
            arr[i] = value;
        }

        for(int i = 1; i < index; i++){
            int length = arr[i] -  arr[i - 1]; // 가로수 거리
            gcd = GCD(length, gcd);
        }

        for(int i = 1; i < index; i++){
            answer += ((arr[i] - arr[i - 1]) / gcd) - 1; // 두 가로수의 길이 / 최대공약수 - 1
        }
        System.out.println(answer);
    }
    public static int GCD(int a , int b){

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
