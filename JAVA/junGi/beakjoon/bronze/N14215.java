package JAVA.junGi.beakjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class N14215 {
    /**
     * 영선이는 길이가 a, b, c인 세 막대를 가지고 있고, 각 막대의 길이를 마음대로 줄일 수 있다.
     * 영선이는 세 막대를 이용해서 아래 조건을 만족하는 삼각형을 만들려고 한다.
     * 각 막대의 길이는 양의 정수이다
     * 세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다.
     * 삼각형의 둘레를 최대로 해야 한다.
     * a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = {A, B, C};
        Arrays.sort(arr);

        if(arr[0] + arr[1] > arr[2]){ // 가장큰 값이 나머지 값보다 크면 안됨
            System.out.println(arr[0] + arr[1] + arr[2]);
        }else{
            System.out.println((arr[0] + arr[1]) * 2 - 1);
        }


    }
}
