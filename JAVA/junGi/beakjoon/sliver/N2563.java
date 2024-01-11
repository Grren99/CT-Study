package JAVA.junGi.beakjoon.sliver;

import java.util.Scanner;

public class N2563 {

    /**
     *가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
     * 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int count = sc.nextInt(); // 갯수
        int[][] arr = new int[100][100]; // 가로 세로 100 100
        int answer = 0; // 정답

        for(int i = 0; i < count; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            //가로 세로 10 10
            for(int j = X; j < X+10; j++){
                for(int k = Y; k < Y+10; k++){
                    arr[j][k] = 1;
                }
            }
        }
        for(int i = 0 ; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(arr[i][j] == 1) answer++;
            }
        }
        System.out.println(answer);
    }
}
