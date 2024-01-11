package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N3009 {
    /**
     * 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arrX = new int[3];
        int[] arrY = new int[3];

        for(int i = 0 ; i < 3; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            arrX[i] = X;
            arrY[i] = Y;
        }
        int X = fourPointSystem(arrX);
        int Y = fourPointSystem(arrY);
        System.out.print(X + " " + Y);
    }
    // 네번째 점 찾는 시스템
    public static int fourPointSystem(int[] arr){

        if(arr[0] == arr[1]) return arr[2];
        if(arr[1] == arr[2]) return arr[0];
        return arr[1];
    }
}
