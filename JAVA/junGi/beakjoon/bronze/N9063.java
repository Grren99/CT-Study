package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N9063 {
    /**
     * 예를 들어 위와 같이 (2, 1), (3, 2), (5, 2), (3, 4) 네 점에서 옥구슬을 발견하였다면,
     * 임씨에게 돌아갈 대지는 (2, 1), (5, 1), (2, 4), (5, 4)를 네 꼭짓점으로 하는 직사각형이며, 넓이는 (5 - 2) × (4 - 1) = 9 가 된다.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int length = 0;
        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;

        for(int i = 0 ; i < count; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            maxX = Math.max(maxX , x);
            minX = Math.min(minX , x);
            maxY = Math.max(maxY , y);
            minY = Math.min(minY , y);
        }
        length = (maxX - minX) * (maxY - minY);
        System.out.println(length);
    }
}
