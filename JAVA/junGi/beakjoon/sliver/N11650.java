package JAVA.junGi.beakjoon.sliver;

import java.util.Arrays;
import java.util.Scanner;

public class N11650 {
    /**
     * 2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[][] arr = new int[index][2];

        for (int i = 0; i < index; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (a , b) -> {
            if(a[0] == b[0]){ // X좌표가 같을 경우
                return a[1] - b[1]; // Y좌표로 정렬
            }else {
                return a[0] - b[0]; // X좌표로 정렬
            }
        });
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < index; i++){
            stringBuilder.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(stringBuilder);
    }
}
