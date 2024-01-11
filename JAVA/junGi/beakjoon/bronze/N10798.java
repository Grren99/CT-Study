package JAVA.junGi.beakjoon.bronze;

import java.util.Scanner;

public class N10798 {
    /**
     * Aa0aPAf985Bz1EhCz2W3D1gkD6x
     * 칠판에 붙여진 단어들이 주어질 때, 영석이가 세로로 읽은 순서대로 글자들을 출력하는 프로그램을 작성하시오
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char[][] c = new char[5][15];

        String str = "";
        // 문자열 그릇에 담기
        for(int i = 0; i < c.length; i++){
            str = sc.next();
            for(int j = 0; j < str.length(); j++){
                c[i][j] = str.charAt(j);
            }
        }
        // 세로 출력 코드
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                // \0 빈 문자열 출력 하지 않음
                if(c[j][i] == '\0'){
                    continue;
                }
                System.out.print(c[j][i]);
            }
        }
    }
}
