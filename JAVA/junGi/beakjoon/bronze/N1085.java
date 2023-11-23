package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N1085 {
    /**
     * 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
     * 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int answer = minValueSystem(x , y, w, h);
        System.out.println(answer);
    }
    public static int minValueSystem(int X, int Y, int width, int heigth){
        int minX = Math.min(X, width - X);
        int minY = Math.min(Y, heigth - Y);
        return Math.min(minX, minY);
    }
}
